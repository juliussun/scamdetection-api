package com.example.scam_detection.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class ScamUserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<List<String>> getScamUserCountGroupByAge() {
        String sql = "select age,count(scam_id) from scams join user on scams.user_id=user.user_id group by age;";
        return jdbcTemplate.query(sql, new RowMapper<List<String>>(){
            @Override
            public List<String> mapRow(ResultSet rs, int rowNum) throws SQLException{
                List<String> row = new ArrayList<>();
                row.add(String.valueOf(rs.getInt("age")));
                row.add(String.valueOf(rs.getInt(2)));
                return row;
            }
        });
    }
}
