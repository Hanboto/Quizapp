package com.e.quizapp.presentation.quiz;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import com.e.quizapp.R;
import com.e.quizapp.presentation.quiz.recycler.QuizAdapter;

import static android.nfc.cardemulation.CardEmulation.EXTRA_CATEGORY;

public class QuizActivity extends AppCompatActivity {

    private QuizViewModel mViewModel;

    private RecyclerView mRecyclerQuiz;
    private QuizAdapter mAdapterQuiz;

    private final static String EXTRA_AMOUNT = "amount";
    private final static String EXTRA_CATEGORY = "category";
    private final static String EXTRA_DIFFICULTY = "difficulty";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mRecyclerQuiz = findViewById(R.id.quiz_recycler_quiz);
        mAdapterQuiz =new QuizAdapter();
        mRecyclerQuiz.setAdapter(mAdapterQuiz);
        mRecyclerQuiz.setLayoutManager(new LinearLayoutManager(getBaseContext(),RecyclerView.HORIZONTAL,false));


        int amount = getIntent().getIntExtra(EXTRA_AMOUNT, 5);
        String difficulty = getIntent().getStringExtra(EXTRA_DIFFICULTY);

    }

    public static void start(Context context, int amount, String category, String difficulty) {
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra(EXTRA_AMOUNT, amount);
        intent.putExtra(EXTRA_CATEGORY, category);
        intent.putExtra(EXTRA_DIFFICULTY, difficulty);
        context.startActivity(intent);

    }
}
