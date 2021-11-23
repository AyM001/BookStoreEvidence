package com.softwareMetrics.bookEvidence.controller;

import com.softwareMetrics.bookEvidence.model.FieldModel;
import com.softwareMetrics.bookEvidence.model.PublisherModel;
import com.softwareMetrics.bookEvidence.service.UtilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FieldOfActivityController {

    @Autowired
    private UtilsService utilsService;


    @GetMapping("/getFields")
    public List<FieldModel> getFieldsOfActivity(){
        return utilsService.getFieldsOfActivity();
    }

    @PostMapping("/addField")
    public void addField(@RequestBody FieldModel fieldModel){
        utilsService.addFieldOfActivity(fieldModel);
    }
}
