public class JaegerTest {
    public static void main(String[] args) {
        Jaeger typhoon=new Jaeger();
        typhoon.setArmor(6);
        typhoon.setHeight(250);
        typhoon.setSpeed(9);
        typhoon.setWeight(1.722);
        typhoon.setOrigin("China");
        typhoon.setName("Mark-4");
        typhoon.setStrength(8);
        typhoon.setStatus("Destroyed");
        System.out.println("Броня -" + typhoon.getArmor() + " Высота - " + typhoon.getHeight()
                + " Скорость - "+ typhoon.getSpeed() + " Масса - " + typhoon.getWeight() + " Производство - "+ typhoon.getOrigin());

    }
}