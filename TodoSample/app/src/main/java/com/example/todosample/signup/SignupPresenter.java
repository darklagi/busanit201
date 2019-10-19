package com.example.todosample.signup;

import com.example.todosample.base.BasePresenterImpl;
import com.example.todosample.logic.Repository;
import com.example.todosample.logic.RepositoryImpl;
import com.example.todosample.model.User;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SignupPresenter extends BasePresenterImpl<SignupConstract.View> implements SignupConstract.Presenter {
    Repository repository;

    SignupPresenter() {
        this.repository = new RepositoryImpl();
        this.repository.setPresenter(this);
    }

    @Override
    public void signUp(User user) {
        this.repository.signUp(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(() -> {
                    view.signUpDone();
                });
    }
}
