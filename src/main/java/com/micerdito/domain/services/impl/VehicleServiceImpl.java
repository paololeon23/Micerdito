package com.micerdito.domain.services.impl;

import com.micerdito.domain.Vehicle;
import com.micerdito.domain.services.VehicleService;
import com.micerdito.infrastructure.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> listVehicle() {
        return vehicleRepository.findAll();
    }
}
