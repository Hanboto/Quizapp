package com.e.quizapp.presentation.main;

import androidx.appcompat.widget.AppCompatSeekBar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.e.quizapp.R;
import com.e.quizapp.core.CoreFragment;
import com.e.quizapp.presentation.quiz.QuizActivity;

import org.angmarch.views.NiceSpinner;

public class MainFragment extends CoreFragment {

    private AppCompatSeekBar mSeekBar;
    private NiceSpinner mCategorySpinner;
    private NiceSpinner mDifficultySpinner;

    private TextView mAmount;
    private TextView mBtn_Start_Quiz;
    private View mStart;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSeekBar = view.findViewById(R.id.main_amount_seek_bar);
        mCategorySpinner = view.findViewById(R.id.main_category_spinner);
        mDifficultySpinner = view.findViewById(R.id.main_difficulty_spinner);
        mAmount = view.findViewById(R.id.main_questions_amount);
        mStart = view.findViewById(R.id.main_start);
        mBtn_Start_Quiz= view.findViewById(R.id.start_btn);
        mBtn_Start_Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuizActivity.start(getContext(),
                        mSeekBar.getProgress(),
                        mCategorySpinner.getSelectedItem().toString(),
                        mDifficultySpinner.getSelectedItem().toString());
                Toast toast = Toast.makeText(getContext(),
                        "Quiz Activity", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mAmount.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuizActivity.start(
                        getContext(),
                        mSeekBar.getProgress(),
                        mCategorySpinner.getSelectedItem().toString(),
                        mDifficultySpinner.getSelectedItem().toString()

                );

                Log.d("ololo", "Start properties - amount:" + mSeekBar.getProgress()
                        + " category: " + mCategorySpinner.getSelectedIndex()
                        + " difficulty: " + mDifficultySpinner.getSelectedIndex());
            }
        });
    }

}
