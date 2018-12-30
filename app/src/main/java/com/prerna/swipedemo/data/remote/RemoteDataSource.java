package com.prerna.swipedemo.data.remote;

import com.prerna.swipedemo.data.remote.model.News;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by prernaakumaree on 28/12/2018.
 * prernaakumaree@gmail.com
 */

public class RemoteDataSource {

    private static final String TAG = RemoteDataSource.class.getSimpleName();

    private RemoteService mRemoteService;

    public RemoteDataSource(RemoteService remoteService) {
        this.mRemoteService = remoteService;
    }

    /**
     * Get articles from api
     *
     * @return
     */
    public Flowable<Response<News>> getArticlesFromApi(){

        return mRemoteService.getArticleFroimApi();
    }
}
