package com.mobile.repositories;

import com.mobile.domain.SikumTmuta;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.domain.Sivukim;

public interface  SivukimRepository extends JpaRepository<Sivukim, Long> {

    // Set<Project> findAllByPartner(int partner);
    // Set<Project> findAllByActive(boolean active);
}

