package bikeRide.funride;

import bikeRide.*;
import bikeRide.models.RoadBike;
import bikeRide.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunRideTest {

    @Test
    void shouldReturnWithTheCorrectBikeTypes(){


        Bicycle RoadBike = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(5);
        funRide.accept(RoadBike);
        funRide.accept(Tandem);
        funRide.accept(RoadBike);


        assertEquals(2, funRide.getCountForType(BicycleType.RoadBike));

    }

    @Test
    void shouldReturnWithTheCorrectBikeTypesAccepted(){


        Bicycle RoadBike = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(5);
        funRide.accept(RoadBike);
        funRide.accept(RoadBike);
        funRide.accept(RoadBike);
        funRide.accept(Tandem);
        funRide.accept(Tandem);
        funRide.accept(Tandem);




        assertEquals(5, funRide.getEnteredCount());

    }

    @Test
    void shouldReturnWithTheCorrectNumberOfBikeTypes(){


        Bicycle RoadBike = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(6);
        funRide.accept(RoadBike);
        funRide.accept(RoadBike);
        funRide.accept(RoadBike);
        funRide.accept(Tandem);
        funRide.accept(Tandem);
        funRide.accept(Tandem);




        assertEquals(6, funRide.getEnteredCount());

    }

}