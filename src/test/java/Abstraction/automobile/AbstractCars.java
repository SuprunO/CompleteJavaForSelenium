package Abstraction.automobile;

/**
 * Created by alex on 16.01.2017.
 */
public abstract class AbstractCars {
    private int privateSpeed;
    public int publicSpeed;

    protected int protectedSpeed;

    int speedLimit =100;

    public AbstractCars(int startSpeed){

        this.privateSpeed=startSpeed;
    }

     public void setPrivateSpeed(int pSpeed){
         this.privateSpeed = pSpeed;

    }

    public void engineStart (){
        System.out.println("Engine is started...");
    }

}


