package com.softwareMetrics.bookEvidence.repository;

import com.softwareMetrics.bookEvidence.model.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublisherRepository extends JpaRepository<PublisherModel , Long> {
}
