package bikeRide.rides;

import bikeRide.models.MountainBike;
import bikeRide.models.RoadBike;
import bikeRide.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideTwoTest {

        @Test
        void RoadBikeOnRideTwoTest(){
            RoadBike bicycle = new RoadBike();
            BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
            bikeRide.ride();

            assertEquals(111, bikeRide.currentSpeed());
        }

    @Test
    void MountainBikeOnRideTwoTest(){
            MountainBike bicycle = new MountainBike();
            BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
            bikeRide.ride();

        assertEquals(54, bikeRide.currentSpeed());
        }

    @Test
    void TandemOnRideTwoTest(){
            Tandem bicycle = new Tandem();
            BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
            bikeRide.ride();

        assertEquals(129, bikeRide.currentSpeed());
        }

}