package com.mobile.services;

import com.mobile.domain.SikumTmuta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Set;


public interface SikumTmutaService {
    Set<SikumTmuta> getAllsikumTmuta();

}
