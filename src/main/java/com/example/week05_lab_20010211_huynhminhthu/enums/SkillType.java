package com.example.week05_lab_20010211_huynhminhthu.enums;

import jakarta.persistence.Embeddable;

@Embeddable
public enum SkillType {
    UNSPECIFIC(0),

    TECHNICAL_SKILL(1),

    SOFT_SKILL(2);

    SkillType(int value) {
    }

    SkillType() {

    }
}