package com.micerdito.domain.services;
import com.micerdito.domain.Vehicle;
import java.util.List;

public interface VehicleService {
    com.micerdito.domain.Vehicle registerVehicle(com.micerdito.domain.Vehicle vehicle);
    List<com.micerdito.domain.Vehicle> listVehicle();
}


