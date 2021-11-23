package com.softwareMetrics.bookEvidence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.List;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor
public class AuthorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "authorModel")
    @JsonIgnore
    private List<BookModel> bookModelList;

}
