package com.example.week05_lab_20010211_huynhminhthu.backend.ids;

import java.io.Serializable;
import java.util.Objects;

public class JobSkillId implements Serializable {
    private long jobId;
    private long skillId;

    public JobSkillId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobSkillId that)) return false;
        return jobId == that.jobId && skillId == that.skillId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, skillId);
    }
}