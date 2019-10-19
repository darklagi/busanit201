package com.example.todosample.main;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.base.BaseView;
import com.example.todosample.model.User;

public class MainContract {
    public interface View extends BaseView {
        void loginDone(User user);
    }

    public interface Presenter extends BasePresenter<View> {
        //TODO fetch Items
        void login(User user);
        //void signUp();
    }
}
