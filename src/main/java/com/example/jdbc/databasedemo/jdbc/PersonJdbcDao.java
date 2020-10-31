package com.example.jdbc.databasedemo.jdbc;

import com.example.jdbc.databasedemo.entity.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {
    @Autowired
    JdbcTemplate template;

    public List<person> findAllPersons(){
        return template.query("select * from person",
                new BeanPropertyRowMapper<person>(person.class));
    }

    public person findById(int id){
        return template.queryForObject("select * from person where id = ?", new Object[]{ id },
                new BeanPropertyRowMapper<>(person.class));
    }

    public int deleteById(int id){
        return template.update("delete from person where id = ?", id);
    }

    public int updatePerson(person p){
        return template.update("update person " +
                " set name = ?, description = ?, joinDate = ? " +
                " where id = ?", p.getName(), p.getDescription(),new Timestamp(p.getJoinDate().getTime()),p.getId());
    }

    public int insertPerson(person p){
        return template.update("insert into person (id ,name ,description ,joinDate ) " +
                        "values(?,?,?,?)",
                p.getId(), p.getName(), p.getDescription(), new Timestamp(p.getJoinDate().getTime()));
    }

}
