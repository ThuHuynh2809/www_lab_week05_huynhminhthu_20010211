package com.example.week05_lab_20010211_huynhminhthu.backend.services;

import com.example.week05_lab_20010211_huynhminhthu.backend.models.Candidate;
import com.example.week05_lab_20010211_huynhminhthu.backend.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;
    public Page<Candidate> findAll(int pageNo, int pageSize, String sortBy,
                                   String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);//findFirst.../findTop...
    }
}
