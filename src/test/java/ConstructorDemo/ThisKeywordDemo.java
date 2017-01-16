package ConstructorDemo;

/**
 * Created by alex on 16.01.2017.
 */
public class ThisKeywordDemo {
    public static void main(String[] args) {
        Car c3 = new Car();

        c3.setMake("BMW");
        System.out.println(c3.getMake());
        System.out.println(c3.speed);
        System.out.println(c3.gear);

        Car c4 = new Car(10,2);
        c4.setMake("Moskvich");
        System.out.println(c4.getMake());
        System.out.println(c4.speed);
        System.out.println(c4.gear);
    }
}
