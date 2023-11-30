package com.example.week05_lab_20010211_huynhminhthu.backend.daos;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public abstract class AbstractDao<T,Id>{
    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbstractDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public AbstractDao(DataSource dataSource){
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }
    public abstract void insert(T entity);
    public abstract T getById(Id id);
    public abstract List<T> getAllTList();
}
