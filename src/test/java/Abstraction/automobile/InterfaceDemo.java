package Abstraction.automobile;

/**
 * Created by alex on 16.01.2017.
 */
public class InterfaceDemo implements CarsInterface,BMWCarsInterface {
    @Override
    public void engineStart(String engineType, boolean isKeyLess) {
        System.out.println("THis is the implementation");
    }

    @Override
    public void headsUpNavigation() {
        System.out.println("This is the heads up navigation");
    }
}
