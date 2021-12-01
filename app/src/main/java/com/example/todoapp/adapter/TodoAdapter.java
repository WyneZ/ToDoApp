package com.example.todoapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todoapp.R;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewholder> {

    Context context;


    public TodoAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public TodoViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_layout, parent, false);
        return new TodoViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TodoViewholder extends RecyclerView.ViewHolder {

        public TodoViewholder(View v) {
            super(v);

        }
    }
}