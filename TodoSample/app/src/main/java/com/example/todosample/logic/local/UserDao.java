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
    @Query("select * from user order by no desc")
    Observable<List<User>> fetchItems();

    // Query item
    @Query("select * from user where no = :no")
    Single<User> fetchUser(int no);

    // Update

    // Insert
    @Insert
    Completable signUp(User user);
}
