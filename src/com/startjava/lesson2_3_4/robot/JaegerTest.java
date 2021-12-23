package com.startjava.lesson2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger robotOne = new Jaeger("Cherno", 123.2f, 10);
        System.out.println("The name is " + robotOne.getName());
        System.out.println("His weight is " + robotOne.getWeight());
        System.out.println("His strength = " + robotOne.getStrength());

        robotOne.launchRockets();
        System.out.println(robotOne.fly());
        robotOne.charge();

       Jaeger robotTwo = new Jaeger("Putin", 999.2f, 9999);
        System.out.println("This one is our lovely " + robotTwo.getName() + ", he is immortal!");
        System.out.println("His weight is " + robotTwo.getWeight());
        System.out.println("His strength is " + robotTwo.getStrength() + " or more, nobody knows for sure.");

        robotTwo.explode();
        robotTwo.dominate();
        robotTwo.ride();

        Jaeger robotThree = new Jaeger("Laguna", 173.2f, 20);
        System.out.println("This one is a " + robotThree.getName());
        System.out.println("His weight is " + robotThree.getWeight());
        System.out.println("His strength is " + robotThree.getStrength());

        robotThree.launchRockets();
        System.out.println(robotThree.fly());
        robotThree.charge();
    }
}