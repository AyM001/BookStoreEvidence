package com.softwareMetrics.bookEvidence.repository;


import com.softwareMetrics.bookEvidence.model.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel , Long> {
}
