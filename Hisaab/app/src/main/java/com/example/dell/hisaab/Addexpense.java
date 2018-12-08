package com.example.dell.hisaab;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Addexpense extends AppCompatActivity {

    EditText category;
    EditText expenseAmount;
    EditText expenseDiscription;
    Button savebtn;

    Button selectDate;
    TextView date;
    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addexpense);

        category =(EditText)findViewById(R.id.income_name);
        expenseAmount=(EditText)findViewById(R.id.expense_amount);
        expenseDiscription=(EditText)findViewById(R.id.writediscription);
        savebtn=(Button)findViewById(R.id.save_btn);

        selectDate = findViewById(R.id.btnDate);
        date = findViewById(R.id.tvSelectedDate);


        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Addexpense.this, "Expense Has Been Saved", Toast.LENGTH_SHORT).show();
                // A function that clear All the field =null
                resetAllFields();
                Intent intent=new Intent(Addexpense.this,Profile.class);
                startActivity(intent);

            }
        });


        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(Addexpense.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                date.setText(day + "/" + (month + 1) + "/" + year);
                            }
                        }, year, month, dayOfMonth);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });

    }

    private void resetAllFields(){

        category.setText("");
        expenseAmount.setText("");
        expenseDiscription.setText("");
    }

    //  Here will be the Functions for Validation

}
