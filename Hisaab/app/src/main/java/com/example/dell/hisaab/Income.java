package com.example.dell.hisaab;

/**
 * Created by Dell on 29-Nov-18.
 */

public class Income {

    private int imageDrwable;
    private String incomeName;
    private int incomeAmount;
    private String incomeDiscription;
    private String date;

    public Income(int imageDrwable, String incomeName, int incomeAmount, String incomeDiscription, String date) {
        this.imageDrwable = imageDrwable;
        this.incomeName = incomeName;
        this.incomeAmount = incomeAmount;
        this.incomeDiscription = incomeDiscription;
        this.date = date;
    }


    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public int getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(int incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public String getIncomeDiscription() {
        return incomeDiscription;
    }

    public void setIncomeDiscription(String incomeDiscription) {
        this.incomeDiscription = incomeDiscription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImageDrwable() {
        return imageDrwable;
    }

    public void setImageDrwable(int imageDrwable) {
        this.imageDrwable = imageDrwable;
    }
}
