package com.e.quizapp.presentation.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.e.quizapp.R;

public class QuizActivity extends AppCompatActivity {

    private QuizViewModel mViewModel;

    private final static String EXTRA_AMOUNT = "amount";
    private final static String EXTRA_CATEGORY = "category";
    private final static String EXTRA_DIFFICULTY = "difficulty";

    public static void start(Context context, int amount,String category, String difficulty) {
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra(EXTRA_AMOUNT, amount);
        intent.putExtra(EXTRA_CATEGORY, category);
        intent.putExtra(EXTRA_DIFFICULTY, difficulty);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        Intent intent = getIntent();
        int amount = intent.getIntExtra(EXTRA_AMOUNT, 0);
        String catteg = intent.getStringExtra(EXTRA_CATEGORY);
        String diff = intent.getStringExtra(EXTRA_DIFFICULTY);

        Toast.makeText(this, "Amount:" + amount +  "Category:" + catteg+"Difficulty:"+diff, Toast.LENGTH_SHORT).show();
    }
}
