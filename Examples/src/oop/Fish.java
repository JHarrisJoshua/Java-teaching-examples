package oop;

//@formatter:off

public class Fish extends Animal {
    public Fish(int age, String gender, int weightLbs) {
        super(age, gender, weightLbs);
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    public void move() {
        System.out.println("The fish swims...");
    }
}
