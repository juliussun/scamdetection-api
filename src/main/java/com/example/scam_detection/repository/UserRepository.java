package com.example.scam_detection.repository;

import com.example.scam_detection.entity.User;
import com.example.scam_detection.model.AgeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("SELECT new com.example.scam_detection.model.AgeDTO(" +
            "CASE WHEN u.age < 20 THEN '20' " +
            "WHEN u.age < 40 THEN '40' " +
            "WHEN u.age < 60 THEN '60' " +
            "ELSE '60+' END, " +
            "COALESCE(COUNT(r), 0)) " +
            "FROM User u " +
            "LEFT JOIN Record r ON r.user = u " +
            "GROUP BY " +
            "CASE WHEN u.age < 20 THEN '20' " +
            "WHEN u.age < 40 THEN '40' " +
            "WHEN u.age < 60 THEN '60' " +
            "ELSE '60+' END " +
            "ORDER BY " +
            "CASE WHEN u.age < 20 THEN '20' " +
            "WHEN u.age < 40 THEN '40' " +
            "WHEN u.age < 60 THEN '60' " +
            "ELSE '60+' END")
    List<AgeDTO> findAgeAndRecordCount();
}

