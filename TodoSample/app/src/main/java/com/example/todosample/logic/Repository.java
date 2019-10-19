package com.example.todosample.logic;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.model.User;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface Repository<T> {
    void setPresenter(BasePresenter<T> presenter);

    Single<User> login(User user);
    Completable signUp(User user);
}
