package com.mobile.repositories;

import com.mobile.domain.NotruLesivuk;
import com.mobile.domain.SikumTmuta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  NotruLesivukRepository extends JpaRepository<NotruLesivuk, Long> {

    // Set<Project> findAllByPartner(int partner);
    // Set<Project> findAllByActive(boolean active);
}
