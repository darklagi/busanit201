package com.example.todosample.logic;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.model.User;

import io.reactivex.Single;

public interface Repository<T> {
    void setPresenter(BasePresenter<T> presenter);

    Single<String> login(User user);
}
