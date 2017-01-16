package ObjectDemo;

/**
 * Created by alex on 16.01.2017.
 */
public class ThisKeywordDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.setMake("BMW");
        System.out.println(c1.getMake());
        c2.setMake("Moskvitch");
        System.out.println(c2.getMake());
    }
}
