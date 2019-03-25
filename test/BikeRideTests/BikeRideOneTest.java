package BikeRideTests;

import BikeRide.models.MountainBike;
import BikeRide.models.RoadBike;
import BikeRide.models.Tandem;
import BikeRide.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideOneTest {

    @Test
    public void BikeRideOne() {

        RoadBike bicycle = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(52, bikeRide.currentSpeed());

    }

    @Test
    void MountainBikeTest(){

        MountainBike bicycle = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(26, bikeRide.currentSpeed());

    }

    @Test
    void TandemTest(){

        Tandem bicycle = new Tandem();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(62, bikeRide.currentSpeed());

    }

}