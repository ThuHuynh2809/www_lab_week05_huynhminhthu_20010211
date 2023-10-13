package com.example.week05_lab_20010211_huynhminhthu.models;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name ="job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long jobId;
    @Column(name = "job_desc", length = 2000)
    private String jobDescription;
    @Column(name = "job_name", length = 255)
    private String jobName;

    @OneToOne
    @JoinColumn(name = "com_id")
    private Company company;

    public Job() {
    }

    public Job(long jobId, String jobDescription, String jobName, Company company) {
        this.jobId = jobId;
        this.jobDescription = jobDescription;
        this.jobName = jobName;
        this.company = company;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobName='" + jobName + '\'' +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return jobId == job.jobId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId);
    }
}