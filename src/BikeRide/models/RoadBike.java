package BikeRide.models;

import BikeRide.BicycleBase;
import BikeRide.BicycleType;

public class RoadBike extends BicycleBase {

//    private int speed = 0;

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

//    public int currentSpeed(){
//        return speed;
//    }
//
//    public void stop(){
//        speed = 0;
//    }
}
