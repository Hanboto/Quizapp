package com.e.quizapp.presentation.history.recycler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.quizapp.R;

import static com.e.quizapp.R.id.item_history_data;

public class HistoryViewHolder extends RecyclerView.ViewHolder {
    //Todo:
    TextView mcategory;
    TextView mcorrectAmount;
    TextView mdifficultyHistry;
    TextView mdataHistory;


    public HistoryViewHolder(@NonNull View itemView) {
        super(itemView);
        mcorrectAmount = itemView.findViewById(R.id.item_history_correct_amount);
        mdifficultyHistry = itemView.findViewById(R.id.item_history_difficulty);
        mdataHistory = itemView.findViewById(item_history_data);
        mcategory = itemView.findViewById(R.id.item_history_title);

    }
}
