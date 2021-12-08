package com.example.todoapp;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AddNewTask extends BottomSheetDialogFragment {

    public static final String TAG = "ActionBottomDialog";
    private EditText et_InputTask;
    private ImageButton ib_Calendar, ib_Flag, ib_sendTask;

    public static AddNewTask getInstance() {
        return new AddNewTask();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NORMAL, R.style.DialogStyle);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_sheet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et_InputTask = getView().findViewById(R.id.et_InputTask);
        ib_Calendar = getView().findViewById(R.id.ib_Calendar);
        ib_Flag = getView().findViewById(R.id.ib_Flag);
        ib_sendTask = getView().findViewById(R.id.ib_sendTask);

        et_InputTask.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().trim().equals("")) {
                    ib_sendTask.setColorFilter(Color.GRAY);
                    ib_sendTask.setBackgroundColor(Color.WHITE);
                    ib_sendTask.setEnabled(false);
                }
                else {
                    ib_sendTask.setColorFilter(Color.WHITE);
                    ib_sendTask.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.button_background));
                    ib_sendTask.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ib_Calendar.setOnClickListener(v -> {
            ib_Calendar.setColorFilter(ContextCompat.getColor(getContext(), R.color.crimson));
        });

        ib_Flag.setOnClickListener(v -> {
            ib_Flag.setColorFilter(ContextCompat.getColor(getContext(), R.color.crimson));
        });

        ib_sendTask.setOnClickListener(v -> {

        });

    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
    }
}
