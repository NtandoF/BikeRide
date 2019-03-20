package bicycles;

import bicycles.models.Tandem;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

   class  TandemTest{

    @Test
    public void shouldAccelerate(){

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
    }

       @Test
       public void shouldBrake(){

           Tandem bicycle = new Tandem();
           bicycle.brake();
           assertEquals(7, bicycle.currentSpeed());
       }

       @Test
       public void shouldStop(){

           Tandem bicycle = new Tandem();
           bicycle.stop();
           assertEquals(0, bicycle.currentSpeed());
       }

}