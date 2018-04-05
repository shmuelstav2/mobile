package com.mobile.controllers;



import com.mobile.domain.SikumTmuta;
import com.mobile.domain.Sivukim;
import com.mobile.services.SikumTmutaService;
import com.mobile.services.SivukimService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

//@Api(description = "manage all the projects data")
@Controller
@RequestMapping("/api/sivukim/")
public class SivukimController {
    private final SivukimService sivukimService;

    public SivukimController(SivukimService sivukimService) {
        this.sivukimService = sivukimService;
    }

    //@ApiOperation(value = "get project by id partner", notes = "These are some notes about the API.")
    @GetMapping({"/all/"})
    public ResponseEntity<Set<Sivukim>> getAllsikumTmuta() {
        return new ResponseEntity<Set<Sivukim>>(sivukimService.getAllSivukim(), HttpStatus.OK);
    }

}


