package com.example.todoapp.db;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Model {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    private int id;

    @ColumnInfo(name = "Task")
    private String task;

    @ColumnInfo(name = "Priority")
    private int priority;

    @ColumnInfo(name = "Status")
    private boolean completed;
}
