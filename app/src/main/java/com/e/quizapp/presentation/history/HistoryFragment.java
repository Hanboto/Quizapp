package com.e.quizapp.presentation.history;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.e.quizapp.R;
import com.e.quizapp.core.CoreFragment;
import com.e.quizapp.model.History;
import com.e.quizapp.presentation.history.recycler.HistoryAdapter;

import java.util.ArrayList;

public class HistoryFragment extends CoreFragment {

    TextView historytitle;
    RecyclerView recyclerView;

    private HistoryViewModel mViewModel;
    private ArrayList<History> histories = new ArrayList<>();

    public static HistoryFragment newInstance() {
        return new HistoryFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_history;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.history_recycler);
        historytitle= view.findViewById(R.id.history_title);
        histories.add(new History("Category:Mixed","Correct answers:8/10","Difficulty:Easy","06 Oct 2017 20:54"));
        histories.add(new History("Category:Mixed","Correct answers:4/10","Difficulty:Medium","07 Nov 2015 21:25"));
        histories.add(new History("Category:Mixed","Correct answers:6/10","Difficulty:Hard","09 Sep 2016 06:32"));
        histories.add(new History("Category:Mixed","Correct answers:5/10","Difficulty:Medium","02 May 2018 21:35"));
        histories.add(new History("Category:Mixed","Correct answers:2/10","Difficulty:Easy","01 Des 2020 12:25"));
        histories.add(new History("Category:Mixed","Correct answers:1/10","Difficulty:Hard","05 Feb 2019 23:13"));


        HistoryAdapter adapter = new HistoryAdapter(histories);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
