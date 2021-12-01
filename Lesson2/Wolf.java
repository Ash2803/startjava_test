public class Wolf {

    String sex;
    String nickname;
    float weight;
    int age;
    String color;

    void walk() {
        System.out.println("Jerry is walking");
    }

    void sit() {
        System.out.println("Jerry is sitting");
    }

    void run() {
        System.out.println("Jerry is running");
    }

    boolean howl() {
        System.out.println("Jerry is howling");
        return true;
    }

    String hunt() {
        return "and love hunting <3";
    }
}