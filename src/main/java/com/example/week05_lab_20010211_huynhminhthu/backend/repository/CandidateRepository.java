package com.example.week05_lab_20010211_huynhminhthu.backend.repository;

import com.example.week05_lab_20010211_huynhminhthu.backend.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}