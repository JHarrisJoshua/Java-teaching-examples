package oop;

//@formatter:off

public class Bird extends Animal {
    public Bird(int age, String gender, int weightLbs) {
        super(age, gender, weightLbs);
    }
    public void move() {
        System.out.println("Flapping wings...");
    }
}
