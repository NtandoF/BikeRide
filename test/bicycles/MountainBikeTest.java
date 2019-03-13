package bicycles;

import bicycles.models.MountainBike;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest {

    @Test
    public void shouldReturnTheCurrentSpeedOfBikeRideOne(){

        MountainBike bicycle = new MountainBike();
        BikeRideOne bikeride = new BikeRideOne(bicycle);
        bikeride.ride();

        assertEquals(26, bikeride.currentSpeed());
    }

    @Test
    public void shouldReturnTheCurrentSpeedOfBikeRideTwo(){

        MountainBike bicycle = new MountainBike();
        BikeRideTwo bikeride = new BikeRideTwo(bicycle);
        bikeride.ride();

        assertEquals(54, bikeride.currentSpeed());
    }

    @Test
    public void shouldReturnTheCurrentSpeedOfBikeRideThree(){

        MountainBike bicycle = new MountainBike();
        BikeRideThree bikeride = new BikeRideThree(bicycle);
        bikeride.ride();

        assertEquals(47, bikeride.currentSpeed());
    }

}