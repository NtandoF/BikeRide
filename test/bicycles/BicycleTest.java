package bicycles;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTest {

    @Test
    public void RoadBikeTest() {

        RoadBike bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

        assertEquals(36, bikeRide.currentSpeed());


    }

    @Test
    public void MountainBikeTest(){

        MountainBike bicycle = new MountainBike();
        BikeRide bikeride = new BikeRide(bicycle);
        bikeride.ride();

        assertEquals(14, bikeride.currentSpeed());
    }

}
