public class Person {

    String personName = "Bruce";
    String personSex = "Male";
    float height = 180.2f;
    float weight = 75.5f;
    int age = 42;

    boolean sit() {
        System.out.println("You are sitting");
        return true;
    }

    void sleep() {
        System.out.println("You are sleeping");
    }

    String watchTv() {
        return "Watching TV";
    }

    void eat() {
        System.out.println("Eating something delicious");
    }
}