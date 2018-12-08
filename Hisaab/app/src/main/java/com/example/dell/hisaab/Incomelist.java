package com.example.dell.hisaab;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Incomelist extends AppCompatActivity {

    private ListView listView;
    private IncomeAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incomelist);



        listView = (ListView) findViewById(R.id.income_list);
        ArrayList<Income> incomesList = new ArrayList<>();
        incomesList.add(new Income(R.drawable.titanic,"Something",100," Somethi"," "));
        incomesList.add(new Income(R.drawable.titanic,"Something",100," Somethi"," "));
        incomesList.add(new Income(R.drawable.titanic,"Something",100," Somethi"," "));

        mAdapter = new IncomeAdapter(this,incomesList);
        listView.setAdapter(mAdapter);

    }
}
