package com.example.trafficbackend.controller;

import com.example.trafficbackend.entity.VehicleEvent;
import com.example.trafficbackend.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TrafficController {

    @Autowired
    private VehicleRepository repo;

    @PostMapping("/event")
    public VehicleEvent save(@RequestBody VehicleEvent event) {

        int fine;

        if (event.getSpeed() > 120) {
            fine = 5000;
            event.setStatus("Overspeed");
        } else if (event.getSpeed() > 100) {
            fine = 2000;
            event.setStatus("High");
        } else {
            fine = 1000;
            event.setStatus("Normal");
        }

        event.setFine(fine);
        event.setTimestamp(System.currentTimeMillis());

        return repo.save(event);
    }

    @GetMapping("/events")
    public java.util.List<VehicleEvent> getAll() {
        return repo.findAll();
    }
}