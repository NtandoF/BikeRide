package bikeRide.models;

import bikeRide.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadBikeTest {

    @Test
    public void shouldAccelerate() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());

    }

    @Test
    public void shouldBrake() {
        RoadBike bicycle = new RoadBike();
        bicycle.brake();
        assertEquals(4, bicycle.currentSpeed());
    }

    @Test
    public void shouldStop() {
        RoadBike bicycle = new RoadBike();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

}