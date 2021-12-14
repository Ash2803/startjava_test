package com.startjava.lesson2_3.animal.wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("stallion");
        wolfOne.setNickname("Jerry");
        wolfOne.setWeight(8.2f);
        wolfOne.setAge(4);
        wolfOne.setColor("Brown");
        System.out.println("The dog is a " + wolfOne.getSex());
        System.out.println("His name is " + wolfOne.getNickname());
        System.out.println("His weight is " + wolfOne.getWeight());
        System.out.println("He is " + wolfOne.getAge());
        System.out.println("And his color is " + wolfOne.getColor());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        System.out.println(wolfOne.hunt());
    }
}
