package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
   public static void main(String[] args) {
        Jaeger typhoon = new Jaeger();
        typhoon.setArmor(8);
        typhoon.setHeight(250);
        typhoon.setSpeed(9);
        typhoon.setWeight(1.722);
        typhoon.setName("Mark-4");
        typhoon.setOrigin("China");
        typhoon.setStrenght(9);
        typhoon.setStatus("Destroyed");
        System.out.println("Jaeger Crimson Typhoon: Броня - " + typhoon.getArmor() + ", Высота - " + typhoon.getHeight()
                + ", Скорость - " + typhoon.getSpeed() + ", Масса - " + typhoon.getWeight());
        System.out.println (" Производство - " + typhoon.getOrigin() + ", Name - " + typhoon.getName()
                + " Сила - " +  typhoon.getStrenght() + ", Статус - " + typhoon.getStatus()); 
        
        Jaeger horison = new Jaeger();
        horison.setArmor(9);
        horison.setHeight(238);
        horison.setSpeed(8);
        horison.setWeight(7.890);
        horison.setName("Mark-1");
        horison.setOrigin("China");
        horison.setStrenght(10);
        horison.setStatus("Destroyed");
        System.out.println("Jaeger Horison Brave:  Броня - " + horison.getArmor() + ", Высота - " + horison.getHeight()
                + ", Скорость - " + horison.getSpeed() + ", Масса - " + horison.getWeight());
        System.out.println (" Производство - " + horison.getOrigin() + ", Name - " + horison.getName() +
                " Сила - " +  horison.getStrenght() + ", Статус - " + horison.getStatus());

    }
}
