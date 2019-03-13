package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

   class  TandemTest{

    @Test
    public void shouldReturnTheCurrentSpeedOfBikeRideOne(){

        Tandem bicycle = new Tandem();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(62, bikeRide.currentSpeed());
    }

       @Test
       public void shouldReturnTheCurrentSpeedOfBikeRideTwo(){

           Tandem bicycle = new Tandem();
           BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
           bikeRide.ride();

           assertEquals(129, bikeRide.currentSpeed());
       }

       @Test
       public void shouldReturnTheCurrentSpeedOfBikeRideThree(){

           Tandem bicycle = new Tandem();
           BikeRideThree bikeRide = new BikeRideThree(bicycle);
           bikeRide.ride();

           assertEquals(111, bikeRide.currentSpeed());
       }

}