package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeRideThreeTest {

    @Test
    void BikeRideThree(){

        RoadBike bicycle = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(80, bikeRide.currentSpeed());

    }

    @Test
    void MountainBikeTest(){

        MountainBike bicycle = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(47, bikeRide.currentSpeed());

    }

    @Test
    void TandemTest(){

        Tandem bicycle = new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(111, bikeRide.currentSpeed());

    }


}