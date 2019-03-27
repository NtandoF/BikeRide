package bikeRide.rides;

import bikeRide.models.MountainBike;
import bikeRide.models.RoadBike;
import bikeRide.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideThreeTest {

    @Test
    void RoadBikeOnRideThreeTest(){
        RoadBike bicycle = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(80, bikeRide.currentSpeed());
    }

    @Test
    void MountainBikeOnRideThreeTest(){
        MountainBike bicycle = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(47, bikeRide.currentSpeed());
    }

    @Test
    void TandemOnRideThreeTest(){
        Tandem bicycle = new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(111, bikeRide.currentSpeed());
    }


}