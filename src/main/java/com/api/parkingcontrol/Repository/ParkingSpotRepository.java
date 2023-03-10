package com.api.parkingcontrol.Repository;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.Model.ParkingSpotsModel;

@Repository
public interface ParkingSpotRepository  extends JpaRepository<ParkingSpotsModel, UUID>{

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByApartmentAndBlock (String block, String apartment);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    
}
