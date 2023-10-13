package com.example.week05_lab_20010211_huynhminhthu.services;

import com.example.week05_lab_20010211_huynhminhthu.models.Candidate;
import com.example.week05_lab_20010211_huynhminhthu.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;

    public Page<Candidate> findAllCandidates(int pageNumber, int pagesize){
        Pageable pageable = PageRequest.of(pageNumber,pagesize);
        return candidateRepository.findAll(pageable);
    }
}
