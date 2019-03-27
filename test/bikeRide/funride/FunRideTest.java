package bikeRide.funride;

import bikeRide.*;
import bikeRide.models.RoadBike;
import bikeRide.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunRideTest {

    @Test
    void shouldReturnWithTheCorrectBikeTypes(){

        Bicycle RoadBike2 = new RoadBike();
        Bicycle RoadBike = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(5);
        funRide.accept(RoadBike);
        funRide.accept(Tandem);
        funRide.accept(RoadBike2);

        assertEquals(2, funRide.getCountForType(BicycleType.RoadBike));

    }

    @Test
    void shouldReturnWithTheCorrectBikeTypesAccepted(){

        Bicycle RoadBike = new RoadBike();
        Bicycle RoadBike3 = new RoadBike();
        Bicycle RoadBike2 = new RoadBike();
        Bicycle Tandem = new Tandem();
        Bicycle Tandem5 = new Tandem();
        Bicycle Tandem4 = new Tandem();

        FunRide funRide = new FunRide(5);
        funRide.accept(RoadBike);
        funRide.accept(RoadBike3);
        funRide.accept(RoadBike2);
        funRide.accept(Tandem4);
        funRide.accept(Tandem5);
        funRide.accept(Tandem);

        assertEquals(5, funRide.getEnteredCount());

    }

    @Test
    void shouldReturnWithTheCorrectNumberOfBikeTypes(){

        Bicycle RoadBike = new RoadBike();
        Bicycle RoadBike2 = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(6);
        funRide.accept(RoadBike);
        funRide.accept(RoadBike2);
        funRide.accept(RoadBike);
        funRide.accept(Tandem);


        assertEquals(3, funRide.getEnteredCount());

    }

}