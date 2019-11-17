package com.e.quizapp.presentation.history.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.quizapp.R;
import com.e.quizapp.presentation.history.model.History;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolder> {

    private ArrayList<History> list;

    public HistoryAdapter(ArrayList<History> list){
        this.list = list;

    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, parent, false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {
        holder.mdifficultyHistry.setText(list.get(position).getAnswers());
        holder.mcorrectAmount.setText(list.get(position).getDifficulty());
        holder.mdataHistory.setText(list.get(position).getData());
        holder.mcategory.setText(list.get(position).getCategory());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
