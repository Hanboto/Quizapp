package com.e.quizapp.data;
import com.e.quizapp.model.Question;

import java.util.List;

public interface IQuizRepository {
    void getQuiz(OnQuizCallback callback);

    interface OnQuizCallback {
        void onSuccess(List<Question> questions);

        void onFailure(Exception e);
    }
}
