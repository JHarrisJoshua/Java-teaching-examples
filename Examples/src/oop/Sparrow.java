package oop;

//@formatter:off

public class Sparrow extends Bird implements Flyable {

    public Sparrow(int age, String gender, int weightLbs) {
        super(age, gender, weightLbs);
    }
    public void fly() {
        System.out.println("Flying...");
    }

}
