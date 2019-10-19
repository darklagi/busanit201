package com.example.todosample.main;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.base.BaseView;
import com.example.todosample.model.User;

public class MainContract {
    public interface View extends BaseView {
        /*
        void fetchItemsDone(List<Item> items);
        void showDetail(Item item);
         */
    }

    public interface Presenter extends BasePresenter<View> {
        //TODO fetch Items
        void login(User user);
        /*
        void fetchItems();
        void fetchItem(int no);
        void fetchItemsDone(List<Item> items);
        void showDetail(Item item);
        */
    }
}
