package bikeRide.models;

import bikeRide.BicycleBase;
import bikeRide.BicycleType;

public class MountainBike extends BicycleBase {

//    private int speed = 0;

    @Override
    public BicycleType BicycleType() {
        return BicycleType.MountainBike;
    }

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
