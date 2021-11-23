package com.softwareMetrics.bookEvidence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PublisherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisherModel" )
    @JsonIgnore
    private List<BookModel> bookModelList;
}
