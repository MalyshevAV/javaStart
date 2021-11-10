public class WolfModTest {
    public static void main(String[] args) {
        WolfMod wolf = new WolfMod();
        wolf.setAge(5);
        wolf.setColor("grey");
        wolf.setName("Jack");
        wolf.setSex("male");
        wolf.setWeight(20);
        System.out.println("Волку - " + wolf.getAge() + " лет, Цвет - " + wolf.getColor());
        System.out.println("Кличка - "+ wolf.getName() + ", Пол - "+ wolf.getSex() + ", Вес - "+ wolf.getWeight());
    }
}