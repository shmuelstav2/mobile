package com.mobile.services;


import com.mobile.domain.SikumTmuta;
import com.mobile.domain.Sivukim;
import com.mobile.repositories.SikumTmutaRepository;
import com.mobile.repositories.SivukimRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class SivukimServiceImpl  implements SivukimService {

    private SivukimRepository sivukimRepository ;


    public SivukimServiceImpl(  SivukimRepository sivukimRepository ) {
        this.sivukimRepository= sivukimRepository;

    }


   @Override
    public Set<Sivukim> getAllSivukim() {
        Set<Sivukim> sivukim = new HashSet<>();
        sivukimRepository.findAll().iterator().forEachRemaining(sivukim::add);
        return sivukim;
    }
}

