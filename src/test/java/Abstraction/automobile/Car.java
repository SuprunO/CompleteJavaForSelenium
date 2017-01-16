package Abstraction.automobile;

/**
 * Created by alex on 16.01.2017.
 */

public class Car {
    // No Modifier - accessible in the same package
    int speed;
    // Only in class
    @SuppressWarnings("unused")
    private int privateSpeed;

    // Anywhere in Java World with importing the package and class
    public int publicSpeed;

    // In same package and in sub classes
    protected int protectedSpeed;

    int speedLimit = 100 ;

    public Car () {
        this(0);
    }

    public void setPrivateSpeed(int pSpeed) {
        this.privateSpeed = pSpeed;
    }

    public Car (int startSpeed) {
        this.privateSpeed = startSpeed;
    }

    public void increaseSpeed() {
        if (speed < 100) {
            speed++;
        }
        System.out.println("Increasing Speed of Cars ");
    }

    protected void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing Speed of Cars");
    }
}
