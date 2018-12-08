package com.example.dell.hisaab;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class Profile extends AppCompatActivity {

    private Button addincome_btn;
    private Button addexpense_btn;
    private Button addgoal_btn;
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        addincome_btn=(Button)findViewById(R.id.income_btn);
        addexpense_btn=(Button)findViewById(R.id.expense_btn);
        addgoal_btn=(Button)findViewById(R.id.goal_btn);


        addincome_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                Intent intent=new Intent(Profile.this,Incomelist.class);
                startActivity(intent); // startActivity allow you to move
            }
        });


        addexpense_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,Incomelist.class);
                startActivity(intent); // startActivity allow you to move
            }
        });


        addgoal_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,Incomelist.class);
                startActivity(intent); // startActivity allow you to move
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mainmanu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
       if(id==R.id.home)
       {
//           Intent intent=new Intent(Profile.this,Goallist.class);
//           startActivity(intent); // startActivity allow you to move
           Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
           return  true;
       }

       if(id==R.id.Profile)
       {
           Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
           Intent intent=new Intent(Profile.this,Profile.class);
           startActivity(intent); // startActivity allow you to move
           return true;
       }
        if(id==R.id.addincomem)
        {
            Toast.makeText(this, "Add Income is clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Addincome.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.addexpensem)
        {
            Toast.makeText(this, "Add Expense is clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Addexpense.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.addgoalm)
        {
            Toast.makeText(this, "Add Goal is clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Addgoal.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.reciveloanm)
        {
            Toast.makeText(this, "Recive Loan is clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Recivedloans.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.giveloanm)
        {
            Toast.makeText(this, "Give Loan is clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Addincome.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.income)
        {
            Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Expenselist.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.expense)
        {
            Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Expenselist.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.goal)
        {
            Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Expenselist.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.reciveloans)
        {
            Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Expenselist.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }
        if(id==R.id.mylons)
        {
            Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Profile.this,Incomelist.class);
            startActivity(intent); // startActivity allow you to move
            return true;
        }

       if(id==R.id.logout)
       {
           Toast.makeText(this, "Android Menu is Clicked", Toast.LENGTH_LONG).show();
           Intent intent=new Intent(Profile.this,Login.class);
           startActivity(intent); // startActivity allow you to move
           return true;
       }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        super.onBackPressed();
    }
}
