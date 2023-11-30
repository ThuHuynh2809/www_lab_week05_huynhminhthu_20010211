package com.example.week05_lab_20010211_huynhminhthu.backend.daos;

import com.example.week05_lab_20010211_huynhminhthu.backend.models.Address;
import com.example.week05_lab_20010211_huynhminhthu.backend.models.Candidate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CandidateDao extends AbstractDao<Candidate, Long>{

    public CandidateDao(DataSource dataSource){
        super(dataSource);
    }
    @Override
    public void insert(Candidate entity){
        String sql = "insert into candidate values(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,entity.getId(),entity.getDob(),entity.getPhone(),entity.getAddress(),entity.getEmail());
    }
    @Override
    public Candidate getById(Long id){
        String sql = "select * from candidate where id=?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Candidate.class),id);
    }
    @Override
    public List<Candidate> getAllTList(){
        String sql = "select * from candidate";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Candidate.class));
    }
}