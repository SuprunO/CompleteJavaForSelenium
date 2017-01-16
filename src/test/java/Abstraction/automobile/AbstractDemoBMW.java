package Abstraction.automobile;

/**
 * Created by alex on 16.01.2017.
 */
public class AbstractDemoBMW extends AbstractCars{
    public AbstractDemoBMW(int startSpeed) {
        super(startSpeed);
    }

    public void setPrivateSpeed(int speed){
        super.setPrivateSpeed(10);
    }
    public void engineStart( ){
        super.engineStart();
        System.out.println("BMW has keyless engine start");
    }
}

