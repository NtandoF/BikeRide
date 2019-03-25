package bikeRide.funride;

import bikeRide.*;
import bikeRide.specification.BicycleFromSpec;
import bikeRide.specification.BicycleSpecification;
import bikeRide.models.RoadBike;
import bikeRide.models.Tandem;
import bikeRide.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunRideTest {

    @Test
    void shouldReturnWithTheCorrectBikeTypes(){

        BicycleSpecification RoadBikeSpec = new BicycleSpecification(12, 7, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(RoadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        Bicycle RoadBike = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(5);
        funRide.accept(RoadBike);
        funRide.accept(Tandem);
        funRide.accept(RoadBike);
//        funRide.accept(bicycle);
//        funRide.accept(bicycle);
//        funRide.accept(bicycle);

        System.out.println(funRide.getCountForType(BicycleType.RoadBike));



        assertEquals(2, funRide.getCountForType(BicycleType.RoadBike));

    }

    @Test
    void shouldReturnWithTheCorrectBikeTypesAccepted(){

        BicycleSpecification RoadBikeSpec = new BicycleSpecification(12, 7, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(RoadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        Bicycle RoadBike = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(5);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);




        assertEquals(6, funRide.getCountForType(BicycleType.RoadBike));

    }

    @Test
    void shouldReturnWithTheCorrectNumberOfBikeTypes(){

        BicycleSpecification RoadBikeSpec = new BicycleSpecification(12, 7, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(RoadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        Bicycle RoadBike = new RoadBike();
        Bicycle Tandem = new Tandem();

        FunRide funRide = new FunRide(6);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);




        assertEquals(6, funRide.getEnteredCount());

    }

}