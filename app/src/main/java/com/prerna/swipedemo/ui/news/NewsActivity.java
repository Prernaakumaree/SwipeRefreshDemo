package com.prerna.swipedemo.ui.news;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import com.prerna.swipedemo.R;
import com.prerna.swipedemo.SwipeDemoApp;
import com.prerna.swipedemo.data.local.entities.ArticleEntity;
import com.prerna.swipedemo.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by prernaakumaree on 28/12/2018
 * prernaakumaree@gmail.com
 */

public class NewsActivity extends BaseActivity implements ContractNews.ContractView, NewsAdapter.OnItemClickListener {

    private static final String TAG = NewsActivity.class.getSimpleName();

    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerview;

    @BindView(R.id.content_error)
    RelativeLayout mErrorContainer;

    @BindView(R.id.swiperefreshlayout)
    SwipeRefreshLayout mSwipeContainer;

    private NewsAdapter mAdapter;

    @Inject
    NewsPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ButterKnife.bind(this);

        SwipeDemoApp.getNewsComponent().inject(this);

        mPresenter.attachView(this);

        mPresenter.getArticles(this);

        // Setup refresh listener which triggers new data loading
        mSwipeContainer.setOnRefreshListener(() ->
            {
                // Your code to refresh the list here.
                // Make sure you call mSwipeContainer.setRefreshing(false)
                // once the network request has completed successfully.
                mPresenter.getArticles(this);
            }
        );

        // Configure the refreshing colors
        mSwipeContainer.setColorSchemeResources(android.R.color.holo_blue_bright,
            android.R.color.holo_green_light,
            android.R.color.holo_orange_light,
            android.R.color.holo_red_light);

        setUpAdapter();

    }

    @Override
    protected void setUpAdapter() {

        mAdapter = new NewsAdapter(this, new ArrayList<>(), this);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(mLayoutManager);
        mRecyclerview.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mRecyclerview.setAdapter(mAdapter);

    }

    @Override
    public void onArtilesReady(List<ArticleEntity> items) {

        if(items != null && !items.isEmpty()) {

            hideErrorContainer();
            mAdapter.setItems(items);
            mSwipeContainer.setRefreshing(false);

        }else{

            showErrorContainer();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.refresh:
                // Set the text color to red
                mPresenter.getArticles(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onItemClick(ArticleEntity item) {

        if (item != null && item.getUrl() != null && !item.getUrl().isEmpty())
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(item.getUrl())));
    }

    private void showErrorContainer() {

        mErrorContainer.setVisibility(View.VISIBLE);
    }

    private void hideErrorContainer() {

        mErrorContainer.setVisibility(View.GONE);

    }

    @OnClick(R.id.repeat_btn)
    public void onViewClicked() {

        mPresenter.getArticles(this);
    }

    @Override
    protected void onDestroy() {

        mPresenter.detachView();
        super.onDestroy();
    }
}
