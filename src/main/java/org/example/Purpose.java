package org.example;

import java.util.List;

public class Purpose {
    private String namePurpose;
    private double amount;
    private Category category;
    private Notification notification;
    private double capital;

    public Purpose(String namePurpose, double amount, Category category, Notification notification) {
        this.namePurpose = namePurpose;
        this.amount = amount;
        this.category = category;
        this.notification = notification;
    }

    public String getNamePurpose() {
        return namePurpose;
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public double getCapital() {
        return capital;
    }

    public void setNamePurpose(String namePurpose) {
        this.namePurpose = namePurpose;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public boolean isCompleted(){
        if(capital >= amount){
            return true;
        }
        else {return false;}
    }
}
