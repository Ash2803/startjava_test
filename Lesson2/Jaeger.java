public class Jaeger {

    private String name;
    private float weight;
    private int strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void launchRockets() {
        System.out.println("He can launch rockets");
    }

    public String flying() {
        return "He can fly over the world";
    }

    public void charging() {
        System.out.println("And sometimes he need to charge his battery");
    }

    public void explode() {
        System.out.println("He can easily blow up something");
    }

    public void dominate() {
        System.out.println("He is the greatest one!");
    }

    public void riding() {
        System.out.println("He can ride bears and other animals");
    }
}