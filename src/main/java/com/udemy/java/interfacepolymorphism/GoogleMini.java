package com.udemy.java.interfacepolymorphism;

public class GoogleMini implements Alarm {
    public void ask(){
        System.out.println("How's the weather outside");
    }

    public void setAlarm(){
        System.out.println("Google mini Setting an alarm @7:30AM");
    }
}
