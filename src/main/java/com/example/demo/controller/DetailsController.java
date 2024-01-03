package com.example.demo.controller;

import com.example.demo.entity.DetailsEntity;
import com.example.demo.service.DetailsService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class DetailsController {

    @Autowired
    DetailsService detailsService;

    @GetMapping
    public ResponseEntity<String> getDefault() {
        return new ResponseEntity<String>("Hello, Welcome to Engineering Lab! Start editing to see some magic happen :)", HttpStatus.OK);
    }

    @GetMapping(value = "getDetails", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getDetails() {
        List<DetailsEntity> details = detailsService.getDetails();
        Gson gson = new Gson();
        String detailsString = gson.toJson(details);
        return new ResponseEntity<>(detailsString, HttpStatus.OK);
    }


}
