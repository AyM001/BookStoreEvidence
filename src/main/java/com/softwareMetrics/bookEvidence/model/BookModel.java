package com.softwareMetrics.bookEvidence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private int releaseYear;

    @ManyToOne(cascade = CascadeType.ALL)
    private AuthorModel authorModel;

    @ManyToOne(cascade = CascadeType.ALL)
    private PublisherModel publisherModel;

    @ManyToOne(cascade = CascadeType.ALL)
    private FieldModel  fieldModel;

}
