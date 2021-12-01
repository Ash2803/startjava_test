public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "stallion";
        wolfOne.nickname = "Jerry";
        wolfOne.weight = + 8.2f;
        wolfOne.age = 4;
        wolfOne.color = "Brown";
        System.out.println("The dog is a " + wolfOne.sex);
        System.out.println("His name is " + wolfOne.nickname);
        System.out.println("His weight is " + wolfOne.weight);
        System.out.println("He is " + wolfOne.age);
        System.out.println("And his color is " + wolfOne.color);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        System.out.println(wolfOne.hunt());
    }
}