package bicycles;

import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleSpecificationTest {

    @Test
    void MountainBikeTest(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();

        assertEquals(52, mBikeRide.currentSpeed());

    }

    @Test
    void RoadBikeTest(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(52, bikeRide.currentSpeed());

    }
}