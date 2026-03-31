package com.campus.booking_api.repositories;

import com.campus.booking_api.models.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkstationRepository extends JpaRepository<Workstation,Integer> {
}
