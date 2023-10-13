package com.example.week05_lab_20010211_huynhminhthu.models;
import com.example.week05_lab_20010211_huynhminhthu.enums.SkillLevel;
import jakarta.persistence.*;

@Entity@Table
@IdClass(JobSkillId.class)
public class JobSkill {

    @Column(name = "skill_level")
    private SkillLevel skillLevel;
    private String moreInfo;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Job job;



}
