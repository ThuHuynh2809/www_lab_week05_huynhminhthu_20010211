package com.example.week05_lab_20010211_huynhminhthu.backend.daos;

import com.example.week05_lab_20010211_huynhminhthu.backend.models.Address;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class AddressDao extends AbstractDao<Address, Long>{

    public AddressDao(DataSource dataSource){
        super(dataSource);
    }
    @Override
    public void insert(Address entity){
        String sql = "insert into address values(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,entity.getId(),entity.getStreet(),entity.getCity(),entity.getNumber(),entity.getZipCode(),entity.getCountry());
    }
    @Override
    public Address getById(Long id){
        String sql = "select * from address where id=?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Address.class),id);
    }
    @Override
    public List<Address> getAllTList(){
        String sql = "select * from address";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Address.class));
    }
}

