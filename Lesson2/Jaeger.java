public class Jaeger {

    private  String name;
    private float weight;
    private int strength;

    public Jaeger(String name, float weight, int strength) {
        this.name = name;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public void launchRockets() {
        System.out.println("He can launch rockets");
    }

    public String fly() {
        return "He can fly over the world";
    }

    public void charge() {
        System.out.println("And sometimes he need to charge his battery");
    }

    public void explode() {
        System.out.println("He can easily blow up something");
    }

    public void dominate() {
        System.out.println("He is the greatest one!");
    }

    public void ride() {
        System.out.println("He can ride bears and other animals");
    }
}