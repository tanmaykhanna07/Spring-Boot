package com.campus.booking_api.controllers;

import com.campus.booking_api.models.Lab;
import com.campus.booking_api.repositories.LabRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/labs")
public class LabController {

    private final LabRepository labRepository;

    public LabController(LabRepository labRepository){
        this.labRepository = labRepository;
    }

    @PostMapping
    public Lab createLab(@RequestBody Lab newLab){
        return labRepository.save(newLab);
    }

    @GetMapping
    public List<Lab> getAllLabs(){
        return labRepository.findAll();
    }
}
