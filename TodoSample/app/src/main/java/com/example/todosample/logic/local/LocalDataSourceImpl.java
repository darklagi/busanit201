package com.example.todosample.logic.local;

import com.example.todosample.logic.DataSource;
import com.example.todosample.logic.Repository;

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

    /*
    // Fetch Items
    @Override
    public Maybe<List<Item>> fetchItems() {
        return appDatabase.getItemDao().fetchItems();
    }

    @Override
    public Maybe<Item> fetchItem(int no) {
        return appDatabase.getItemDao().fetchItem(no);
    }
     */
}
