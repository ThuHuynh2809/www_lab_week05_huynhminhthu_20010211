package com.example.week05_lab_20010211_huynhminhthu.backend.repository;

import com.example.week05_lab_20010211_huynhminhthu.backend.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

