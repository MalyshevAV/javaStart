public class JaegerTest {
   public static void main(String[] args) {
        Jaeger typhoon=new Jaeger();
        typhoon.setHeight(250);
        typhoon.setSpeed(9);
        typhoon.setWeight(1.722);
        typhoon.setName("Mark-4");

        System.out.println("Jaeger Crimson Typhoon: Броня - " + typhoon.getArmor() + ", Высота - " + typhoon.getHeight()
                + ", Скорость - " + typhoon.getSpeed() + ", Масса - " + typhoon.getWeight());
        System.out.println (" Производство - " + typhoon.getOrigin()+ ", Name - " + typhoon.getName()
                + " Сила - " +  typhoon.getStrenght() + ", Статус - " + typhoon.getStatus());
      
        Jaeger horison=new Jaeger();
        horison.setHeight(238);
        horison.setSpeed(8);
        horison.setWeight(7.890);
        horison.setName("Mark-1");
        System.out.println("Jaeger Horison Brave:  Броня - " + horison.getArmor() + ", Высота - " + horison.getHeight()
                + ", Скорость - " + horison.getSpeed() + ", Масса - " + horison.getWeight());
        System.out.println (" Производство - " + horison.getOrigin()+ ", Name - " + horison.getName()+
                " Сила - " +  horison.getStrenght() + ", Статус - " + horison.getStatus());

    }
}
