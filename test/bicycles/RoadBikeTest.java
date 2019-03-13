package bicycles;

import bicycles.models.RoadBike;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadBikeTest {

    @Test
    public void shouldReturnTheCurrentSpeedOfBikeRideOne() {

        RoadBike bicycle = new RoadBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(52, bikeRide.currentSpeed());


    }

    @Test
    public void shouldReturnTheCurrentSpeedOfBikeRideTwo() {

        RoadBike bicycle = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();

        assertEquals(111, bikeRide.currentSpeed());

    }

    @Test
    public void shouldReturnTheCurrentSpeedOfBikeRideThree() {

        RoadBike bicycle = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(80, bikeRide.currentSpeed());

    }

}