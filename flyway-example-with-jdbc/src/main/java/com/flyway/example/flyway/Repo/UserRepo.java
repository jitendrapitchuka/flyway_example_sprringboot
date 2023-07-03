package com.flyway.example.flyway.Repo;

import com.flyway.example.flyway.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String save(User user){

        String query="insert into flyway_test(id,name,age,phone_no) values(?,?,?,?)";
        jdbcTemplate.update(query,user.getId(),user.getName(),user.getAge(),user.getPhoneNo());
        return "added success";
    }
}
