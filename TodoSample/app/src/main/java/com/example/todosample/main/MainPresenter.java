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
                .subscribe((Consumer<String>) s -> {
                    //뭔가 화면으로 출력 로직
                });

    }
    /*
    @Override
    public void fetchItems() {
        this.repository.fetchItems()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Consumer<List<Item>>) items -> {
                    view.fetchItemsDone(items);
                });
    }

    @Override
    public void fetchItem(int no) {
        this.repository.fetchItem(no)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((Consumer<Item>) item -> {
                    view.showDetail(item);
                });
    }

    @Override
    public void fetchItemsDone(List<Item> items) {
        view.fetchItemsDone(items);
    }

    @Override
    public void showDetail(Item item) {
        view.showDetail(item);
    }
    */
}
