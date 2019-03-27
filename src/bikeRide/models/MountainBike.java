package bikeRide.models;

import bikeRide.BicycleBase;
import bikeRide.BicycleType;

public class MountainBike extends BicycleBase {

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

}
