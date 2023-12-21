package org.example;

public class Budget {
    private double balance;

    public Budget(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addIncome(double amount, Category category){
        if (amount > 0) {
            Income income = new Income(amount, "21.12.2023", category);
            balance += income.getAmount();
            System.out.println("Доход в размере " + amount + " добавлен.");
        } else {
            System.out.println("Некорректная сумма дохода. Введите положительное значение.");
        }
    }

    public void addExpense(double amount, Category category){
        if (amount > 0) {
            Expense expense = new Expense(amount, "21.12.2023", category);
            balance -= expense.getAmount();
            System.out.println("Расход в размере " + amount + " добавлен.");
        } else {
            System.out.println("Некорректная сумма расхода. Введите положительное значение.");
        }
    }
}
