package com.example.week05_lab_20010211_huynhminhthu.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class CandidateController {
    @GetMapping("/candidates")
    public void showCandidate() {
        System.out.println("CandidateController.showCandidate");
    }
}