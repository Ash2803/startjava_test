package com.startjava.lesson1.conditionalstatement;

public class ConditionalStatement {   
    public static void main(String[] args) {
        int age = 18;
        if (age < 20) {
            System.out.println("Younger");
        }

        boolean sexMale = true;
        if (sexMale) {
            System.out.println("He is a male");
        }

        if (!sexMale) {
            System.out.println("Female");
        }

        double height = 1.82;
        if (height < 1.80) {
            System.out.println("Lower");
        } else {
            System.out.println("Taller then 1.80");
        }

        char nameFirstLetter = 'G';
        if (nameFirstLetter == 'M') {
            System.out.println("Maria");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Irina");
        } else {
            System.out.println("His name is Grisha");
        } 
    }
}