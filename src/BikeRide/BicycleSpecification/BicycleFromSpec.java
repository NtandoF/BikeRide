package BikeRide.BicycleSpecification;

import BikeRide.BicycleBase;
import BikeRide.BicycleType;

public class BicycleFromSpec extends BicycleBase {
    private final BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
       this.bicycleSpecification = bicycleSpecification;
    }


    @Override
    public void accelerate() {
        this.changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed(this.bicycleSpecification.getBrakeSpeed());
    }

    @Override
    public BicycleType BicycleType(){
        return this.bicycleSpecification.getBicycleType();
    }
}
