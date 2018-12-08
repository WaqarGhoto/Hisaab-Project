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

public class Giveloan extends AppCompatActivity {

    EditText reciverName;
    EditText reciverCNIC;
    EditText amount;
    EditText intrest;
    EditText rDiscription;
    Button savebtn;

    Button selectDate;
    TextView date;
    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    Button returnDate;
    TextView rdvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giveloan);

        reciverName =(EditText)findViewById(R.id.reciver_name);
        reciverCNIC =(EditText)findViewById(R.id.reciver_cnic);
        amount=(EditText)findViewById(R.id.r_amount);
        intrest=(EditText)findViewById(R.id.intrest_amount);
        rDiscription=(EditText)findViewById(R.id.rloandiscription);
        savebtn=(Button)findViewById(R.id.save_btn);

        selectDate = findViewById(R.id.btnrecive);
        date = findViewById(R.id.reciveview);

        returnDate = findViewById(R.id.btnReturn);
        rdvalue = findViewById(R.id.returnview);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Giveloan.this, "Your Loan given to Someone  Has Been Saved", Toast.LENGTH_SHORT).show();
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
                datePickerDialog = new DatePickerDialog(Giveloan.this,
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

        returnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(Giveloan.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                rdvalue.setText(day + "/" + (month + 1) + "/" + year);
                            }
                        }, year, month, dayOfMonth);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });
    }

    private void resetAllFields(){

        reciverName.setText("");
        reciverCNIC.setText("");
        amount.setText("");
        intrest.setText("");
        rDiscription.setText("");
        rdvalue.setText("");
        date.setText("");
    }
}
