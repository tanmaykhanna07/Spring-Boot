package com.campus.booking_api.controllers;

import com.campus.booking_api.models.Workstation;
import com.campus.booking_api.repositories.WorkstationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workstations")
public class WorkstationController {

    private final WorkstationRepository workstationRepository;

    public WorkstationController(WorkstationRepository workstationRepository){
        this.workstationRepository = workstationRepository;
    }

    @PostMapping
    public Workstation createWorkstation(@RequestBody Workstation newWorkstation){
        return workstationRepository.save(newWorkstation);
    }

    @GetMapping
    public List<Workstation> getAllWorkstation(){
        return workstationRepository.findAll();
    }
}
