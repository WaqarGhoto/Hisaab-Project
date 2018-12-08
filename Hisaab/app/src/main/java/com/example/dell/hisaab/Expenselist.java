package com.example.dell.hisaab;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Expenselist extends AppCompatActivity {

    private ListView  listView;
    private ExpenseAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenselist);

        // Here is the Adapter Code
        listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<Expense> moviesList = new ArrayList<>();
        moviesList.add(new Expense(R.drawable.money1 , "After Earth" , "2013"));
        moviesList.add(new Expense(R.drawable.titanic, "Baby Driver" , "2017"));
        moviesList.add(new Expense(R.drawable.titanic, "Deadpool" , "2016"));
        moviesList.add(new Expense(R.drawable.titanic, "Divergent" , "2014"));
        moviesList.add(new Expense(R.drawable.titanic, "Fight Club" , "1999"));
        moviesList.add(new Expense(R.drawable.titanic, "Jaws" , "1975"));
        moviesList.add(new Expense(R.drawable.titanic, "Pirates of the Caribbean" , "2011"));
        moviesList.add(new Expense(R.drawable.titanic, "Star Wars" , "2016"));
        moviesList.add(new Expense(R.drawable.titanic, "The Grey" , "2011"));

        mAdapter = new ExpenseAdapter(this,moviesList);
        listView.setAdapter(mAdapter);
    }
}
