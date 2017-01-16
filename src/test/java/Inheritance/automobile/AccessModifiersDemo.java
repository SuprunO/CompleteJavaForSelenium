package Inheritance.automobile;

/**
 * Created by alex on 16.01.2017.
 */

public class AccessModifiersDemo {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.increaseSpeed();
        c1.speed = 10;
        c1.setPrivateSpeed(10);
        c1.publicSpeed = 100;
        c1.protectedSpeed = 100;
        c1.decreaseSpeed();
    }
}
