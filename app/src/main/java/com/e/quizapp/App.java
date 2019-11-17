package com.e.quizapp;

import android.app.Application;

import com.e.quizapp.data.IQuizRepository;
import com.e.quizapp.data.QuizRepository;


public class App extends Application {

    public static IQuizRepository quizRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        quizRepository = new QuizRepository();
    }

}
