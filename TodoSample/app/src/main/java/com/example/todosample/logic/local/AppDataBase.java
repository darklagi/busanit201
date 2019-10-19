package com.example.todosample.logic.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.todosample.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract UserDao getUserDao();
}
