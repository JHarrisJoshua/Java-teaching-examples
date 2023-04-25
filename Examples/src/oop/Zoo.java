package oop;

//@formatter:off

public class Zoo {
    public static void main(String[] args) {
        /*
            interfaces and abstract classes
         */

        Sparrow sparrow1 = new Sparrow(1, "M", 4);
        // sparrow1.move();

        Fish fish1 = new Fish(5, "F", 5);
        fish1.move();

        moveAnimals(sparrow1);
        // moveAnimals(fish1);

        Flyable flyablebird1 = new Sparrow(1,"F", 2);
        flyablebird1.fly();
    }

    public static void moveAnimals(Animal animal) {
        animal.move();
    }
}

