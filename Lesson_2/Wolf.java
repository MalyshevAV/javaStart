public class Wolf {

    String sex;
    String name;
    int weight;
    int age;
    String color;

    public void go() {
        System.out.println("Волк идет по лесу");
    }

    public void sit() {
        System.out.println("Волк сидит у воды");
    }

    public void run() {
        System.out.println("Бежит по полю");
    }

    public void howl() {
        System.out.println("Воет");
    }

     public void hunt() {
        System.out.println("Охотиться на оленя");
     }
}

class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf ();
        wolf.age = 5;
        wolf.color= "grey";
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
