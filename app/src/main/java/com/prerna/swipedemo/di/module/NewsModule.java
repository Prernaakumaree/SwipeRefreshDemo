package com.prerna.swipedemo.di.module;

import com.prerna.swipedemo.data.local.LocalDataSource;
import com.prerna.swipedemo.data.remote.RemoteDataSource;
import com.prerna.swipedemo.di.scope.NewsScope;
import com.prerna.swipedemo.ui.news.NewsPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by prernaakumaree on 26/04/2018.
 * prernaakumaree@gmail.com
 */

@Module
public class NewsModule {

    @Provides
    @NewsScope
    public NewsPresenter providesNewsPresenter(LocalDataSource localDataSource, RemoteDataSource remoteDataSource) {
        return new NewsPresenter(localDataSource, remoteDataSource);
    }
}
