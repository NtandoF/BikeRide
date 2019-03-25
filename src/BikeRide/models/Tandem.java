package BikeRide.models;

import BikeRide.BicycleBase;
import BikeRide.BicycleType;

public class Tandem extends BicycleBase {

    @Override
    public BicycleType BicycleType() {
        return BicycleType.Tandem;
    }

    public void accelerate() {
        changeSpeed(12);
    }

    public void brake(){
        changeSpeed(7);
    }

}
