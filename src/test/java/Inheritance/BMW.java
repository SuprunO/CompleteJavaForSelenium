package Inheritance;

/**
 * Created by alex on 16.01.2017.
 */
public class BMW extends Car{
    public BMW (int startSpeed){
        super (startSpeed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increase speed of BMW");
    }

    public void displayClassNavigation(){
        System.out.println("Specific functionality");
    }
}


