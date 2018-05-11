package com.mobile.controllers;

import com.mobile.domain.NotruLesivuk;
import com.mobile.domain.SikumTmuta;
import com.mobile.services.NotruLesivukService;
import com.mobile.services.SikumTmutaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;


import com.mobile.domain.SikumTmuta;
        import com.mobile.services.SikumTmutaService;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;

        import java.util.Set;


        import java.io.File;
        import java.util.Map;
        import java.io.File;
        import java.util.Map;

        import org.springframework.http.*;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.multipart.MultipartFile;

        import java.io.IOException;
        import java.nio.file.FileSystems;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.*;

        import  java.io.*;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import java.util.List;




//@Api(description = "manage all the projects data")
//@CrossOrigin
@Controller
@RequestMapping("/api/notrulesivuk/")
public class NotruLesivukController {
    private final NotruLesivukService notruLesivukService;

    public NotruLesivukController(NotruLesivukService notruLesivukService) {
        this.notruLesivukService =notruLesivukService;
    }

    //@ApiOperation(value = "get project by id partner", notes = "These are some notes about the API.")
    @GetMapping({"/all/"})
    public ResponseEntity<Set<NotruLesivuk>> getAllNotruLesivuk() {
        return new ResponseEntity<Set<NotruLesivuk>>(notruLesivukService.getAllNotruLesivuk(), HttpStatus.OK);
    }
}
