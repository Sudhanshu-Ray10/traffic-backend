package com.example.trafficbackend.repository;

import com.example.trafficbackend.entity.VehicleEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEvent, Long> {
}