package com.example.trafficbackend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_events")
public class VehicleEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleId;
    private double speed;
    private String zone;
    private boolean emergency;

    private LocalDateTime timestamp;   D

    private Integer fine;
    private String status;

    public Long getId() { return id; }

    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    public String getZone() { return zone; }
    public void setZone(String zone) { this.zone = zone; }

    public boolean isEmergency() { return emergency; }
    public void setEmergency(boolean emergency) { this.emergency = emergency; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public Integer getFine() { return fine; }
    public void setFine(Integer fine) { this.fine = fine; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}