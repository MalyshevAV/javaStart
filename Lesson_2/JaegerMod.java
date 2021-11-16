public class JaegerMod {

    private String name;
    private int armor;
    private int distance;

    public JaegerMod() {
        this.name = "Robot";
        this.armor = 100;
        this.distance = 1000;
    }

    public JaegerMod(String name, int armor, int distance) {
        this.name = name;
        this.armor = armor;
        this.distance = distance;
    }

    public void fire() {
        System.out.println("Робот " + name + " поразил врага на расстоянии " + distance + " метров");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}



