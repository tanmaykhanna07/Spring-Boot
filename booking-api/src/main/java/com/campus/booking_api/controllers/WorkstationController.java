package com.campus.booking_api.controllers;

import com.campus.booking_api.models.Workstation;
import com.campus.booking_api.repositories.WorkstationRepository;
import org.hibernate.jdbc.Work;
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

    @GetMapping("/{id}")
    public Workstation getWorkstationById(@PathVariable Integer id){
        return workstationRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkstationById(@PathVariable Integer id){
        workstationRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Workstation updateWorkstationById(@PathVariable Integer id, @RequestBody Workstation incomingData){
        Workstation existingComputer = workstationRepository.findById(id).orElse(null);

        if(existingComputer != null){
            existingComputer.setStationName(incomingData.getStationName());
            existingComputer.setStatus(incomingData.getStatus());

            return workstationRepository.save(existingComputer);
        }
        return null;
    }
}
