package com.mobile.repositories;

import com.mobile.domain.SikumTmuta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  SikumTmutaRepository extends JpaRepository<SikumTmuta, Long> {

   // Set<Project> findAllByPartner(int partner);
   // Set<Project> findAllByActive(boolean active);
}

