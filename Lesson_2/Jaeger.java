public class Jaeger {

    private String name;
    private String status;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        status = "Destroyed";
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() {
        origin = "China";
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        strength = 8;
        return strength;
    }

    public void setStrenght(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        armor = 6;
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}


