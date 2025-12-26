package org.example;

public class Main {
    public static void main(String[] args) {

        ConditionalExercises conditionalExercises= new ConditionalExercises();
        System.out.println(conditionalExercises.lessThanFive(2));
        System.out.println(conditionalExercises.getAgeGroup(30));
        System.out.println(conditionalExercises.isValidPassword("mottu0317"));

        LoopExercises loopExercises = new LoopExercises();
        System.out.println(loopExercises.sum(5));
        System.out.println(loopExercises.sumUntilEven(10));

        JavaCafe javaCafe = new JavaCafe();
        javaCafe.run();

    }
}