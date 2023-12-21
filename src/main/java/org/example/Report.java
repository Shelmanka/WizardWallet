package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Report {
    private List<Income> incomes;
    private List<Expense> expenses;
    private Budget balance;
    private String reportDate;

    public void makeReport(){
        Map<String, Double> incomeReport = new HashMap<>();
        Map<String, Double> expenseReport = new HashMap<>();

        for (Income income : incomes) {
            String source = income.getCategory().getName();
            incomeReport.put(source, incomeReport.getOrDefault(source, 0.0) + income.getAmount());
        }

        for (Expense expense : expenses) {
            String category = expense.getCategory().getName();
            expenseReport.put(category, expenseReport.getOrDefault(category, 0.0) + expense.getAmount());
        }

        System.out.println("Отчет о доходах пользователя:");
        for (Map.Entry<String, Double> entry : incomeReport.entrySet()) {
            System.out.println("Категория: " + entry.getKey() + ", Сумма: " + entry.getValue());
        }

        System.out.println("\nОтчет о расходах пользователя:");
        for (Map.Entry<String, Double> entry : expenseReport.entrySet()) {
            System.out.println("Категория: " + entry.getKey() + ", Сумма: " + entry.getValue());
        }

        System.out.println("\n Состояние баланса:" + balance.getBalance());
        System.out.println("\n Отчет от:" + reportDate);
    }
}
