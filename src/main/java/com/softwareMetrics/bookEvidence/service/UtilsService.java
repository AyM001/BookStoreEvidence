package com.softwareMetrics.bookEvidence.service;

import com.softwareMetrics.bookEvidence.model.AuthorModel;
import com.softwareMetrics.bookEvidence.model.BookModel;
import com.softwareMetrics.bookEvidence.model.FieldModel;
import com.softwareMetrics.bookEvidence.model.PublisherModel;
import com.softwareMetrics.bookEvidence.repository.AuthorRepository;
import com.softwareMetrics.bookEvidence.repository.BookRepository;
import com.softwareMetrics.bookEvidence.repository.FieldRepository;
import com.softwareMetrics.bookEvidence.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilsService {


    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public List<AuthorModel> getAuthors(){
        return authorRepository.findAll();
    }

    public void addAuthor(AuthorModel authorModel){
        authorRepository.save(authorModel);
    }

    public List<PublisherModel> getPublishers(){
        return publisherRepository.findAll();
    }

    public void addPublisher(PublisherModel publisherModel){
        publisherRepository.save(publisherModel);
    }

    public List<FieldModel> getFieldsOfActivity(){
        return fieldRepository.findAll();
    }

    public void addFieldOfActivity(FieldModel fieldModel){
        fieldRepository.save(fieldModel);
    }


}
