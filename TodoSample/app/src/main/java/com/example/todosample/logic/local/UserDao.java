package com.example.todosample.logic.local;

import android.database.Observable;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.todosample.model.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface UserDao {
    // TODO Query, Insert, Update
    // Query list
    @Query("select * from user where email = :email")
    Single<User> login(String email);

    // Query item
    @Query("select * from user where no = :no")
    Single<User> fetchUser(int no);

    // Update

    // Insert
    @Insert
    Completable signUp(User user);
}
