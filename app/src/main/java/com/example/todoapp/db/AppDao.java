package com.example.todoapp.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AppDao {

    @Query("Select * from Model")
    LiveData<List<Model>> getAllTasks();

    @Insert
    void insertTask(Model model);

    @Update
    void updateTask(Model model);

    @Delete
    void deleteTask(Model model);
}
