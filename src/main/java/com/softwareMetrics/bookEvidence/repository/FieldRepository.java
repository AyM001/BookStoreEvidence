package com.softwareMetrics.bookEvidence.repository;

import com.softwareMetrics.bookEvidence.model.FieldModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FieldRepository extends JpaRepository<FieldModel , Long> {
}
