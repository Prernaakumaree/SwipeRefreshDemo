package com.prerna.swipedemo.ui.news;

import android.content.Context;

import com.prerna.swipedemo.data.local.entities.ArticleEntity;
import com.prerna.swipedemo.ui.base.IBaseView;

import java.util.List;

/**
 * Created by prernaakumaree on 28/12/2018
 * prernaakumaree@gmail.com
 */

public interface ContractNews {

    interface ContractPresenter{

        void getArticles(Context context);

        void getArticlesFromApi();

        void getArticleFromDb();

        void saveArticles(List<ArticleEntity> items);

    }

    interface ContractView extends IBaseView {

        void onArtilesReady(List<ArticleEntity> items);

    }
}
