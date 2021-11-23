package com.softwareMetrics.bookEvidence.controller;


import com.softwareMetrics.bookEvidence.model.AuthorModel;
import com.softwareMetrics.bookEvidence.model.PublisherModel;
import com.softwareMetrics.bookEvidence.service.UtilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherController {


    @Autowired
    private UtilsService utilsService;


    @GetMapping("/getPublishers")
    public List<PublisherModel> getPublishers(){
        return utilsService.getPublishers();
    }

    @PostMapping("/addPublisher")
    public void addPublisher(@RequestBody PublisherModel publisherModel){
        utilsService.addPublisher(publisherModel);
    }
}
