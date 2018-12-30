package com.prerna.swipedemo.di.component;

import com.prerna.swipedemo.data.local.LocalDataSource;
import com.prerna.swipedemo.data.remote.RemoteDataSource;
import com.prerna.swipedemo.di.module.AppModule;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by prernaakumaree on 12/03/2018.
 * prernaakumaree@gmail.com
 */

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {

    LocalDataSource roomDataSource();

    RemoteDataSource remoteDataSource();
}
