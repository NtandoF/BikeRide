package bicycles;

import bicycles.models.MountainBike;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest {

    @Test
    public void shouldAccelerate(){

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldBrake(){

        MountainBike bicycle = new MountainBike();
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());
    }

    @Test
    public void shouldStop(){
        MountainBike bicycle = new MountainBike();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }

}