package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideTwo  {

    private final Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle){
        this.bicycle = bicycle;


    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }

}
