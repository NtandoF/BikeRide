package bikeRide.models;

import bikeRide.BicycleBase;
import bikeRide.BicycleType;

public class RoadBike extends BicycleBase {

    @Override
    public BicycleType BicycleType() {
        return BicycleType.RoadBike;
    }

    public void accelerate(){
        changeSpeed(11 );
    }

    public void brake(){
        changeSpeed(4  );
    }
}
