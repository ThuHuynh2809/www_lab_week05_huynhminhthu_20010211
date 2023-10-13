package com.example.week05_lab_20010211_huynhminhthu.models;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "company")
@Entity
public class Company {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long compId;
    @Column(name = "about", length = 2000)
    private String about;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "comp_name", length = 255)
    private String compName;
    @Column(name = "phone", length = 255)
    private String phone;
    @Column(name ="web_url", length = 255)
    private String web_url;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;

    public Company() {
    }

    public Company(long compId, String about, String email, String compName, String phone, String web_url, Address address) {

        this.compId = compId;
        this.about = about;
        this.email = email;
        this.compName = compName;
        this.phone = phone;
        this.web_url = web_url;
        this.address = address;
    }

    public long getCompId() {
        return compId;
    }

    public void setCompId(long compId) {
        this.compId = compId;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "compId=" + compId +
                ", about='" + about + '\'' +
                ", email='" + email + '\'' +
                ", compName='" + compName + '\'' +
                ", phone='" + phone + '\'' +
                ", web_url='" + web_url + '\'' +
                ", address=" + address +
                '}';
    }
}