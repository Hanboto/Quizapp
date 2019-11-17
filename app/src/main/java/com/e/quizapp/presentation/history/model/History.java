package com.e.quizapp.presentation.history.model;

public class History {
     String category;
     String answers;
     String difficulty;
     String data;

    public History(String category, String answers, String difficulty, String data) {
        this.category = category;
        this.answers = answers;
        this.difficulty = difficulty;
        this.data = data;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
