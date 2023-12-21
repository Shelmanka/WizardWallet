package org.example;

public abstract class Finance {
    private double amount;
    private String date;
    private Category category;

    public Category setCategory(String newCategory){
        return new Category(newCategory);
    }

    public Finance(double amount, String date, Category category) {
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }
}
