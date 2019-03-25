package BikeRide.rides;

import BikeRide.Bicycle;

public class BikeRideThree  {

    private final Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;


    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();

    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
