package com.prerna.swipedemo.data.remote;

import com.prerna.swipedemo.data.remote.model.News;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by prernaakumaree on 28/12/2018.
 * prernaakumaree@gmail.com
 */

public interface RemoteService {

    @GET(".")
    Flowable<Response<News>> getArticleFroimApi();
}
