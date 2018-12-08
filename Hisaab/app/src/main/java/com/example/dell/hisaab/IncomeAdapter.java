package com.example.dell.hisaab;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 29-Nov-18.
 */

public class IncomeAdapter extends ArrayAdapter<Income> {

    private Context mContext;
    private List<Income> incomesList = new ArrayList<>();

    public IncomeAdapter(@NonNull Context context, @LayoutRes ArrayList<Income> list) {
        super(context, 0 , list);
        mContext = context;
        incomesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.income_list_view,parent,false);

        Income currentIncome = incomesList.get(position);

//        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
//        image.setImageResource(currentIncome.getImageDrwable());


        TextView category = (TextView) listItem.findViewById(R.id.textView_category);
        category.setText(currentIncome.getIncomeName());

        TextView amount = (TextView) listItem.findViewById(R.id.textView_amount);
        category.setText(currentIncome.getIncomeAmount());

        TextView mydate = (TextView) listItem.findViewById(R.id.textView_date);
        category.setText(currentIncome.getDate());

        TextView discription = (TextView) listItem.findViewById(R.id.textView_discription);
        discription.setText(currentIncome.getIncomeDiscription());

//        TextView name = (TextView) listItem.findViewById(R.id.category_l1);
//        name.setText(currentIncome.getIncomeName());
//
//        TextView amount = (TextView) listItem.findViewById(R.id.amount_l1);
//        amount.setText(currentIncome.getIncomeAmount());
//
//        TextView discription = (TextView) listItem.findViewById(R.id.discription_l1);
//        discription.setText(currentIncome.getIncomeDiscription());
//
//        TextView date = (TextView) listItem.findViewById(R.id.date_l1);
//        date.setText(currentIncome.getDate());

        return listItem;
    }
}
