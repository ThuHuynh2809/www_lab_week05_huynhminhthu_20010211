package com.example.week05_lab_20010211_huynhminhthu.models;

import com.example.week05_lab_20010211_huynhminhthu.enums.SkillType;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long skillId;
    @Column(name = "skill_desc", length = 300)
    private String skillDescription;
    @Column(name ="skill_name", length = 150)
    private String skillName;

    @Embedded
    @Column(name = "skill_type", length = 4)
    private SkillType type;


    public Skill() {
    }

    public Skill(long skillId, String skillDescription, String skillName, SkillType type) {
        this.skillId = skillId;
        this.skillDescription = skillDescription;
        this.skillName = skillName;
        this.type = type;
    }

    public long getSkillId() {
        return skillId;
    }

    public void setSkillId(long skillId) {
        this.skillId = skillId;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillId=" + skillId +
                ", skillDescription='" + skillDescription + '\'' +
                ", skillName='" + skillName + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skill skill)) return false;
        return skillId == skill.skillId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId);
    }
}