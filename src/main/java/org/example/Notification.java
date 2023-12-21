package org.example;

public class Notification {
    private Purpose purpose;
    public void sendNotification(){
        if (purpose.isCompleted()){
            System.out.println("Поздравляем! Вы достигли цели");
        }
    }
}
