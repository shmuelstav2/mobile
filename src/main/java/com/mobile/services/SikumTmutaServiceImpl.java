package com.mobile.services;

import com.mobile.domain.SikumTmuta;
import com.mobile.repositories.SikumTmutaRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class SikumTmutaServiceImpl implements SikumTmutaService {

    private SikumTmutaRepository sikumTmutaRepository;


    public SikumTmutaServiceImpl( SikumTmutaRepository sikumTmutaRepository) {
        this.sikumTmutaRepository= sikumTmutaRepository;

    }



    @Override
    public Set<SikumTmuta> getAllsikumTmuta() {
        Set<SikumTmuta> sikumTmuta = new HashSet<>();
        sikumTmutaRepository.findAll().iterator().forEachRemaining(sikumTmuta::add);
        return sikumTmuta;
    }
}
