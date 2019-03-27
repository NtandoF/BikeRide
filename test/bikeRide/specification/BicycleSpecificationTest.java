package bikeRide.specification;

import bikeRide.Bicycle;
import bikeRide.BicycleType;
import bikeRide.models.RoadBike;
import bikeRide.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleSpecificationTest {

    @Test
    void MountainBikeAccelarationTest(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);

        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
    }

    @Test
    void RoadBikeAccelarationTest(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);

        assertEquals(11, roadBikeSpec.getAccelerationSpeed());
    }

    @Test
    void TandemAccelarationTest(){
        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.RoadBike);

        assertEquals(12, TandemSpec.getAccelerationSpeed());
    }

    @Test
    void TandemBrakeTest(){
        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.RoadBike);

        assertEquals(7, TandemSpec.getBrakeSpeed());
    }

    @Test
    void RoadBikeBrakeTest(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);

        assertEquals(4, roadBikeSpec.getBrakeSpeed());
    }
    @Test
    void MountainBrakeTest(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);

        assertEquals(3, mountainBikeSpec.getBrakeSpeed());

    }

    @Test
    void TandemTypeTest(){
        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);

        assertEquals(BicycleType.Tandem, TandemSpec.getBicycleType());
    }

    @Test
    void RoadBikeTypeTest(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);

        assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());
    }
    @Test
    void MountainTypeTest(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);

        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());

    }

}