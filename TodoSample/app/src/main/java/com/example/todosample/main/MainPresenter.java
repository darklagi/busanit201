package com.example.todosample.main;

import com.example.todosample.base.BasePresenterImpl;
import com.example.todosample.logic.Repository;
import com.example.todosample.logic.RepositoryImpl;
import com.example.todosample.model.User;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter
        extends BasePresenterImpl<MainContract.View>
        implements MainContract.Presenter {
    Repository repository;

    MainPresenter() {
        this.repository = new RepositoryImpl();
        this.repository.setPresenter(this);
    }

    @Override
    public void login(User user) {
        this.repository.login(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Consumer<User>) u -> {
                    if(user.getPassword().equals(u.getPassword())){
                        u.setLogin(true);
                    }
                    else {
                        u.setLogin(false);
                    }
                });
    }
}
