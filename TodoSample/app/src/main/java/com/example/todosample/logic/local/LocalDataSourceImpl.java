package com.example.todosample.logic.local;

import com.example.todosample.logic.DataSource;
import com.example.todosample.logic.Repository;
import com.example.todosample.model.User;

import io.reactivex.Completable;
import io.reactivex.Single;

public class LocalDataSourceImpl implements DataSource {
    Repository repository;
    AppDataBase appDatabase;

    public LocalDataSourceImpl() {
        try {
            appDatabase = AppDataBaseProvider.getINSTANCE();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Single<User> login(User user) {
        return appDatabase.getUserDao().login(user.getEmail());
    }

    @Override
    public Completable signUp(User user) {
        return appDatabase.getUserDao().signUp(user);
    }
}
