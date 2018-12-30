package com.prerna.swipedemo.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by prernaakumaree on 13/04/2018.
 * prernaakumaree@gmail.com
 */

public interface IBaseView {

    void showLoading();

    void hideLoading();

    void showError(String errorMessage);

    void showError(@StringRes int errorId);

}
