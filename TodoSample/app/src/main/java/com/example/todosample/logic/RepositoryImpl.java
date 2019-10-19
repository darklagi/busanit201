package com.example.todosample.logic;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.logic.local.LocalDataSourceImpl;
import com.example.todosample.model.User;

import io.reactivex.Single;

public class RepositoryImpl <T> implements Repository {
    BasePresenter<T> presenter;
    DataSource localDataSource;
    //DataSource remoteDataSource;

    @Override
    public void setPresenter(BasePresenter presenter) {
        this.presenter = presenter;

        localDataSource = new LocalDataSourceImpl();
        localDataSource.setRepository(this);

        /*
        remoteDataSource = new RemoteDataSourceImpl();
        remoteDataSource.setRepository(this);
        */
    }

    @Override
    public Single<String> login(User user) {

    }
}
