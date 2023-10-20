package com.example.week05_lab_20010211_huynhminhthu.backend.models;

import com.example.week05_lab_20010211_huynhminhthu.backend.enums.SkillLevel;
import com.example.week05_lab_20010211_huynhminhthu.backend.ids.CandidateSkillId;
import jakarta.persistence.*;

@Entity
@IdClass(CandidateSkillId.class)
@Table(name = "candidate_skill")
public class CandidateSkill {
    private String moreInfo;

    @Column(name = "skill_level")
    private SkillLevel skillLevel;


    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;


    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate caniddate;

    public CandidateSkill() {

    }
}