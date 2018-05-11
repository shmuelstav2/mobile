package com.mobile.controllers;

import com.mobile.domain.SikumTmuta;
import com.mobile.services.SikumTmutaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

//@Api(description = "manage all the projects data")
//@CrossOrigin
@Controller
@RequestMapping("/api/sikumtmuta/")
public class SikumTmutaController {
    private final SikumTmutaService sikumTmutaService;

    public SikumTmutaController(SikumTmutaService sikumTmutaService) {
        this.sikumTmutaService =sikumTmutaService;
    }

    //@ApiOperation(value = "get project by id partner", notes = "These are some notes about the API.")
    @GetMapping({"/all/"})
    public ResponseEntity<Set<SikumTmuta>> getAllsikumTmuta() {
        return new ResponseEntity<Set<SikumTmuta>>(sikumTmutaService.getAllsikumTmuta(), HttpStatus.OK);
    }

}


