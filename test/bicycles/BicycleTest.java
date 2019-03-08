package bicycles;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTest {

    @Test
    public void shouldAccellerate() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());

        bicycle.brake();
        assertEquals(bicycle.currentSpeed(), 2);

        bicycle.stop();
        assertEquals(bicycle.currentSpeed(), 0);
    }

}
