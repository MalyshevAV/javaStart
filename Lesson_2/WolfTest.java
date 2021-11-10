public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 5;
        wolf.color = "grey";
        wolf.name = "Jack";
        wolf.sex = "male";
        wolf.weight = 20;
        System.out.println("Волку - " + wolf.age + " лет, Цвет - " + wolf.color +", " + "Кличка - " 
                + wolf.name + ", Пол - "+ wolf.sex + ", Вес - "+ wolf.weight);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
