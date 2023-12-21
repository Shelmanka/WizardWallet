package org.example;

public class PurposeService {
    private Purpose purpose;

    public void addMoney(double summa){
        if(summa > 0){
            purpose.setCapital(purpose.getCapital()+summa);
        }
        else{
            System.out.println("Введено некорректное значение.");
        }
    }

    public void deleteMoney(double summa){
        if(summa > 0){
            purpose.setCapital(purpose.getCapital()-summa);
        }
        else{
            System.out.println("Введено некорректное значение.");
        }
    }
}
