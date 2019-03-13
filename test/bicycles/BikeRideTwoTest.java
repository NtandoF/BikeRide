package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideTwoTest {

        @Test
        void RoadBikeTest(){

            RoadBike bicycle = new RoadBike();
            BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
            bikeRide.ride();

            assertEquals(111, bikeRide.currentSpeed());

        }

    @Test
    void MountainBikeTest(){

        MountainBike bicycle = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();

        assertEquals(54, bikeRide.currentSpeed());

    }

    @Test
    void TandemTest(){

        Tandem bicycle = new Tandem();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();

        assertEquals(129, bikeRide.currentSpeed());

    }

}