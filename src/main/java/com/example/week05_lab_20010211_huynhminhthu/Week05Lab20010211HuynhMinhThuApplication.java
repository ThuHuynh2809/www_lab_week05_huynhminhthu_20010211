package com.example.week05_lab_20010211_huynhminhthu;

import com.example.week05_lab_20010211_huynhminhthu.backend.daos.AddressDao;
import com.example.week05_lab_20010211_huynhminhthu.backend.daos.CandidateDao;
import com.example.week05_lab_20010211_huynhminhthu.backend.enums.Country;
import com.example.week05_lab_20010211_huynhminhthu.backend.models.Address;
import com.example.week05_lab_20010211_huynhminhthu.backend.models.Candidate;
import com.example.week05_lab_20010211_huynhminhthu.backend.repository.AddressRepository;
import com.example.week05_lab_20010211_huynhminhthu.backend.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.time.LocalDate;

@SpringBootApplication
public class Week05Lab20010211HuynhMinhThuApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week05Lab20010211HuynhMinhThuApplication.class, args);
    }

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressDao addressDao;
    @Autowired
    private CandidateDao candidateDao;

    @Bean
    CommandLineRunner initData() {
//        return args -> {
//            Random rnd = new Random();
//            for (int i = 1; i < 1000; i++) {
////				Address add = new Address(rnd.nextInt(1,1000)+"","Quang Trung","HCM",
//////						rnd.nextInt(70000,80000)+"", Country.VIETNAM);
//                Address add = new Address();
//                add.setStreet("Quang Trung");
//                add.setCity("HCM");
//                add.setNumber(String.valueOf(rnd.nextInt(1,1000)));
//                add.setZipCode(String.valueOf(rnd.nextInt(70000,80000)));
//                add.setCountry(Country.VIETNAM);
//                addressRepository.save(add);
//                Candidate can = new Candidate("Name #" + i,
//                        LocalDate.of(1998, rnd.nextInt(1, 13), rnd.nextInt(1, 29)),
//                        add,
//                        rnd.nextLong(1111111111L, 9999999999L) + "",
//                        "email_" + i + "@gmail.com");
//                candidateRepository.save(can);
//                System.out.println("Added: " + can);
//            }
//        };
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Random rnd = new Random();
                for (int i = 1; i < 1000; i++) {
                    Address address = new Address(rnd.nextInt(1, 1000), " ", "Quang Trung", "HCM", rnd.nextInt(70000, 80000) + "", Country.VIETNAM);
                    addressDao.insert(address);
                    Candidate can = new Candidate("Name #" + i, LocalDate.of(1998, rnd.nextInt(1, 13), rnd.nextInt(1, 29)), address, rnd.nextLong(1111111111L, 9999999999L) + "", "email_" + i + "@gmail.com");
                    candidateDao.insert(can);
                }
                candidateDao.getAllTList().forEach(System.out::println);
            }
        };
    }

}
