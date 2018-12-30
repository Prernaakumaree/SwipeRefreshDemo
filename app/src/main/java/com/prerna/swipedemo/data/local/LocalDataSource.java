package com.prerna.swipedemo.data.local;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.prerna.swipedemo.data.local.dao.ArticleDao;
import com.prerna.swipedemo.data.local.entities.ArticleEntity;

import javax.inject.Singleton;

/**
 * Created by prernaakumaree on 28/12/2018
 * prernaakumaree@gmail.com
 */

@Singleton
@Database(entities = ArticleEntity.class, version = 1)
public abstract class LocalDataSource extends RoomDatabase {

    public abstract ArticleDao getArticleDao();

}

