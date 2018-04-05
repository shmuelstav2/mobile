package com.mobile.services;

import com.mobile.domain.NotruLesivuk;
import com.mobile.domain.SikumTmuta;
import com.mobile.repositories.NotruLesivukRepository;
import com.mobile.repositories.SikumTmutaRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class NotruLesivukServiceImpl implements NotruLesivukService {

    private NotruLesivukRepository notruLesivukRepository;


    public NotruLesivukServiceImpl(NotruLesivukRepository notruLesivukRepository) {
        this.notruLesivukRepository= notruLesivukRepository;
    }



    @Override
    public Set<NotruLesivuk> getAllNotruLesivuk() {
        Set<NotruLesivuk> notruLesivuk = new HashSet<>();
        List <NotruLesivuk> notru =  notruLesivukRepository.findAll();
        notruLesivukRepository.findAll().iterator().forEachRemaining(notruLesivuk::add);
        return notruLesivuk;
    }
}
