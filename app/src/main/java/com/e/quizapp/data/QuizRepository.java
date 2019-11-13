package com.e.quizapp.data;

public class QuizRepository implements IQuizRepository {

    @Override
    public void getQuiz(OnQuizCallback callback) {
        callback.onFailure(new Exception("Remote data source not initialized"));
    }

}
