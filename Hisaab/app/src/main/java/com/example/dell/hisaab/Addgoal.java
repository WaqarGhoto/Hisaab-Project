package com.example.dell.hisaab;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Addgoal extends AppCompatActivity {

    EditText category;
    EditText goalAmount;
    EditText goalDiscription;
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
        setContentView(R.layout.activity_addgoal);

        category =(EditText)findViewById(R.id.goal_name);
        goalAmount=(EditText)findViewById(R.id.goal_amount);
        goalDiscription=(EditText)findViewById(R.id.goaldiscription);
        savebtn=(Button)findViewById(R.id.save_btn);

        selectDate = findViewById(R.id.btnDate);
        date = findViewById(R.id.tvSelectedDate);


        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Addgoal.this, "Goal Has Been Saved", Toast.LENGTH_SHORT).show();
                // A function that clear All the field =null
                resetAllFields();

            }
        });


        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(Addgoal.this,
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
        goalAmount.setText("");
        goalDiscription.setText("");
    }
}
