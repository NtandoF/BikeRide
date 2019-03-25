package bikeRide.specification;

import bikeRide.BicycleType;

public class BicycleSpecification {

    private final BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;


    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;

    }

    public int getAccelerationSpeed(){
        return this.accelerationSpeed;
    }

    public int getBrakeSpeed(){
        return this.brakeSpeed;
    }

    public BicycleType getBicycleType(){
        return this.bicycleType;
    }


}
