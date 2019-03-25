package BicycleSpecificationTests;

import BikeRide.Bicycle;
import BikeRide.BicycleSpecification.BicycleFromSpec;
import BikeRide.BicycleSpecification.BicycleSpecification;
import BikeRide.BicycleType;
import BikeRide.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleSpecificationTest {

    @Test
    void MountainBikeTest(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();

        assertEquals(26, mBikeRide.currentSpeed());

    }

    @Test
    void RoadBikeTest(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(52, bikeRide.currentSpeed());

    }

    @Test
    void TandemTest(){

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(TandemSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(62, bikeRide.currentSpeed());

    }
}