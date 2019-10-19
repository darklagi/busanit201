package com.example.todosample.logic;

import com.example.todosample.model.User;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface DataSource {
    void setRepository(Repository repository);

    Single<User> login(User user);
    Completable signUp(User user);
}
