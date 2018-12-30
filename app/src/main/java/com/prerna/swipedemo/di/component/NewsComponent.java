package com.prerna.swipedemo.di.component;

import com.prerna.swipedemo.di.module.NewsModule;
import com.prerna.swipedemo.di.scope.NewsScope;
import com.prerna.swipedemo.ui.news.NewsActivity;

import dagger.Component;

/**
 * Created by prernaakumaree on 26/04/2018.
 * prernaakumaree@gmail.com
 */

@NewsScope
@Component(modules = {NewsModule.class}, dependencies = {AppComponent.class})
public interface NewsComponent {

    void inject(NewsActivity view);
}
