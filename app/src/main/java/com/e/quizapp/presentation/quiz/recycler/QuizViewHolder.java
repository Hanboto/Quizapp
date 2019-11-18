package com.e.quizapp.presentation.quiz.recycler;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.quizapp.R;

public class QuizViewHolder extends RecyclerView.ViewHolder {

    ImageView mImageQuizPrevus;
    TextView mTextNaviation;
    ProgressBar mProgressQuiz;
    TextView mQuizAmount;
    RecyclerView mRecyclerQuiz;
    Button mBtnSkipQuiz;


    public QuizViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageQuizPrevus=itemView.findViewById(R.id.image_quiz_previous);
        mTextNaviation = itemView.findViewById(R.id.navigation);
        mProgressQuiz =itemView.findViewById(R.id.quiz_progress_bar);
        mQuizAmount = itemView.findViewById(R.id.quiz_question_amount);
        mRecyclerQuiz= itemView.findViewById(R.id.quiz_recycler_quiz);
        mBtnSkipQuiz = itemView.findViewById(R.id.skip_button);

    }
}
