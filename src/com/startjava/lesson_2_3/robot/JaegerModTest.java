package com.startjava.lesson_2_3.robot;

public class JaegerModTest {
    public static void main(String[] args) {
        JaegerMod typhoon = new JaegerMod();
        typhoon.setName("Typhoon");
        typhoon.setArmor(300);
        typhoon.setDistance(1000);
        System.out.println("Name " + typhoon.getName() + ", Броня - " + typhoon.getArmor());
        typhoon.fire();
        typhoon.setDistance(5000);
        typhoon.fire();
        JaegerMod horison = new JaegerMod("Horison", 250, 2000);
        System.out.println("Name- " + horison.getName() + ", Броня - " + horison.getArmor());
        horison.fire();
    }
}

