package com.api.parkingcontrol.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.Model.ParkingSpotsModel;
import com.api.parkingcontrol.Repository.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {

    private ParkingSpotRepository parkingSpotRepository;

    ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional // Caso algo dê errado, ele garante que tudo volte ao normal. E evita que tenhamos dados quebrados.
    public ParkingSpotsModel save(ParkingSpotsModel parkingSpotsModel){
        return parkingSpotRepository.save(parkingSpotsModel);
    }
    public List<ParkingSpotsModel> findAll(){
        return parkingSpotRepository.findAll();
    }
    public Optional<ParkingSpotsModel> findById( UUID id){
        return parkingSpotRepository.findById(id);
    }

    public boolean existsByLicensePlateCar (String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);

    }
    public boolean existsByParkingSpotNumber(String parkingSpotNumber){
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }
    public boolean existsByApartmentAndBlock(String block, String apartment){
        return parkingSpotRepository.existsByApartmentAndBlock(block, apartment);
    }


    
}
