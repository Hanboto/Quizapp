package com.e.quizapp.presentation.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.e.quizapp.App;
import com.e.quizapp.R;
import com.e.quizapp.data.IQuizRepository;
import com.e.quizapp.model.Question;

import java.util.List;

import static android.nfc.cardemulation.CardEmulation.EXTRA_CATEGORY;

public class QuizActivity extends AppCompatActivity {

    private QuizViewModel mViewModel;

    private final static String EXTRA_AMOUNT = "amount";
    private final static String EXTRA_DIFFICULTY = "difficulty";

    public static void start(Context context, int amount, String difficulty) {
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra(EXTRA_AMOUNT, amount);
        intent.putExtra(EXTRA_DIFFICULTY, difficulty);
        context.startActivity(intent);
    }

    public static void start(Context context, int amount, String category, String difficulty) {
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

        int amount = getIntent().getIntExtra(EXTRA_AMOUNT, 5);
        String difficulty = getIntent().getStringExtra(EXTRA_DIFFICULTY);

       // App.quizRepository.getQuiz(
         //       new IQuizRepository.OnQuizCallback() {
           //         @Override
             //       public void onSuccess(List<Question> questions) {
               //         for (Question question : questions) {
                 //           Log.d("ololo", question.toString());
                   //     }
                    //}

                    //@Override
                    //public void onFailure(Exception e) {
                      //  e.printStackTrace();
                        //                Log.d("ololo", e.getMessage());
                    //}
                //});
    }
}
