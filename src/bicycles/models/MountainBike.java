package bicycles.models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

//    private int speed = 0;

    public void accelerate() {
        changeSpeed(5);
    }

    public void brake(){

        changeSpeed(3);
    }

//    public int currentSpeed(){
//        return speed;
//    }
//
//    public void stop(){
//        speed = 0;
//    }
}
