package bikeRide.rides;

import bikeRide.models.MountainBike;
import bikeRide.models.RoadBike;
import bikeRide.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideOneTest {

    @Test
    public void RoadBikeOnRideOneTest() {
        RoadBike bicycle = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(52, bikeRide.currentSpeed());

    }

    @Test
    void MountainOnRideOneBikeTest(){
        MountainBike bicycle = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(26, bikeRide.currentSpeed());
    }

    @Test
    void TandemOnRideOneTest(){
        Tandem bicycle = new Tandem();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(62, bikeRide.currentSpeed());
    }

}