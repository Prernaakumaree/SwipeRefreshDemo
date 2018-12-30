package com.prerna.swipedemo;

import android.app.Application;

import com.prerna.swipedemo.di.component.AppComponent;
import com.prerna.swipedemo.di.component.DaggerAppComponent;
import com.prerna.swipedemo.di.component.DaggerNewsComponent;
import com.prerna.swipedemo.di.module.AppModule;
import com.prerna.swipedemo.di.component.NewsComponent;
import com.prerna.swipedemo.di.module.NewsModule;

public class SwipeDemoApp extends Application{

    private static NewsComponent mNewsComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeDagger();

    }

    /**
     * Initialize {@link AppComponent}
     *
     */
    private void initializeDagger(){

        mNewsComponent = DaggerNewsComponent.builder().appComponent(DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build()).newsModule(new NewsModule()).
                build();

    }

    public static NewsComponent getNewsComponent() {
        return mNewsComponent;
    }


}
