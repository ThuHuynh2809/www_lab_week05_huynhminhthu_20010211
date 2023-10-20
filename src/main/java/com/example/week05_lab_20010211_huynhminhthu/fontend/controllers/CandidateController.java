package com.example.week05_lab_20010211_huynhminhthu.fontend.controllers;

import com.example.week05_lab_20010211_huynhminhthu.backend.repository.CandidateRepository;
import com.example.week05_lab_20010211_huynhminhthu.backend.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private CandidateServices candidateServices;

    public CandidateController() {
    }

    @GetMapping("/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates/candidates";
    }
}
