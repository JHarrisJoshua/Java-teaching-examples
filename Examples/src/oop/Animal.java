package oop;

//@formatter:off

public abstract class Animal {
    int age;
    String gender;
    int weightLbs;

    public Animal(int age, String gender, int weightLbs) {
        this.age = age;
        this.gender = gender;
        this.weightLbs = weightLbs;
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();
}
