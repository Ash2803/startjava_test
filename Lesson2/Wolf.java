public class Wolf {

    private String sex;

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    private String nickname;

    public String getNickname() {
        return sex;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private float weight;

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    private int age;

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age < 8 ) {
            System.out.println("Некорректный возраст");
        } else {
        this.age = age;
        }
    }

    private String color;

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Jerry is walking");
    }

    public void sit() {
        System.out.println("Jerry is sitting");
    }

    public void run() {
        System.out.println("Jerry is running");
    }

    public boolean howl() {
        System.out.println("Jerry is howling");
        return true;
    }

    public String hunt() {
        return "and love hunting <3";
    }
}