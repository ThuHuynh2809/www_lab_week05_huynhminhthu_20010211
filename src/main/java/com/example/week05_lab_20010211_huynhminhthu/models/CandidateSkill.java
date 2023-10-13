package com.example.week05_lab_20010211_huynhminhthu.models;

import com.example.week05_lab_20010211_huynhminhthu.enums.SkillLevel;
import jakarta.persistence.*;

@Table
@Entity
@IdClass(CandidateSkillId.class)
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