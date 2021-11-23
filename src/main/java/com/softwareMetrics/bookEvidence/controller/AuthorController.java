package com.softwareMetrics.bookEvidence.controller;


import com.softwareMetrics.bookEvidence.model.AuthorModel;
import com.softwareMetrics.bookEvidence.service.UtilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {


    @Autowired
    private UtilsService utilsService;


    @GetMapping("/getAuthors")
    public List<AuthorModel> getAuthors(){
        return utilsService.getAuthors();
    }

    @PostMapping("/addAuthor")
    public void addAuthor(@RequestBody AuthorModel authorModel){
        utilsService.addAuthor(authorModel);
    }
}
