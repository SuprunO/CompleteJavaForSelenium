package Inheritance;

/**
 * Created by alex on 16.01.2017.
 */
public class InheritanceDemo {
    public static void main(String[] args) {
    int speed =0;

        Car c1 = new Car(speed);
        c1.increaseSpeed();

        BMW bmw1=new BMW(speed);
        bmw1.increaseSpeed();
        bmw1.decreaseSpeed();
        bmw1.displayClassNavigation();


    }

}
