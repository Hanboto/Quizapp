package com.e.quizapp.presentation.result;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.e.quizapp.R;

public class ResultActivity extends AppCompatActivity {

    private ResultViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
}
