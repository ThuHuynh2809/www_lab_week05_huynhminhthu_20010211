package com.example.week05_lab_20010211_huynhminhthu.backend.services;

import com.example.week05_lab_20010211_huynhminhthu.backend.models.Address;
import com.example.week05_lab_20010211_huynhminhthu.backend.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServices {
    @Autowired
    private AddressRepository addressRepository;
    public List<Address> list(){
        return addressRepository.findAll();
    }
}
