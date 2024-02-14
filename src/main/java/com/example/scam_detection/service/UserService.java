package com.example.scam_detection.service;
import java.util.List;
import com.example.scam_detection.entity.User;

public interface UserService {

    List<User> getUsers();

    User getUserById(Integer id);
    
}
