package com.example.week05_lab_20010211_huynhminhthu.repository;

import com.example.week05_lab_20010211_huynhminhthu.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}