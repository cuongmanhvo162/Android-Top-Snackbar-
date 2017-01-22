package com.cuongmv162.customizedsnackbar.auth;

/**
 * Created by cuongmv162 on 1/22/2017.
 */

public interface AuthView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void goHome();

    void loginSuccess();

    void loginFailed();
}
