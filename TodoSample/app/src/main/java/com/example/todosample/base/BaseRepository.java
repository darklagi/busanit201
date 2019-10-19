package com.example.todosample.base;

public interface BaseRepository<T> {
    void setPresenter(BasePresenter<T> presenter);
}
