package Inheritance;

/**
 * Created by alex on 16.01.2017.
 */
public class Car {

    int speed;

    public Car(int startSpeed) {
        speed=startSpeed;
    }


    public void increaseSpeed(){
        speed++;
        System.out.println("Increasing speed of Car");
    }

    public  void decreaseSpeed(){
        speed--;
        System.out.println("Decreasing speed of Car");
    }
}
