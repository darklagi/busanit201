package com.example.todosample.signup;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.base.BaseView;
import com.example.todosample.model.User;

public class SignupConstract {
    public interface View extends BaseView {
        void signUpDone();
    }

    public interface Presenter extends BasePresenter<SignupConstract.View> {
        //void signUpDone(User user);
        void signUp(User user);
    }
}
