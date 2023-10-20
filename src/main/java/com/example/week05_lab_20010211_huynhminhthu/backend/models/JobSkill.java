package com.example.week05_lab_20010211_huynhminhthu.backend.models;
import com.example.week05_lab_20010211_huynhminhthu.backend.enums.SkillLevel;
import com.example.week05_lab_20010211_huynhminhthu.backend.ids.JobSkillId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_skill")
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
