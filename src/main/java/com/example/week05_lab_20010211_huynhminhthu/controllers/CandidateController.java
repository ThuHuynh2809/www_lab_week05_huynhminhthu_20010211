package com.example.week05_lab_20010211_huynhminhthu.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class CandidateController {
    @GetMapping("/candidates")
    public void showCandidate() {
        System.out.println("CandidateController.showCandidate");
    }
}