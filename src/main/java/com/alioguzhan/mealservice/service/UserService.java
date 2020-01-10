package com.alioguzhan.mealservice.service;


import com.alioguzhan.mealservice.model.User;
import com.alioguzhan.mealservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @Transactional
    public User save(User user)
    {
        return userRepository.save(user);
    }
}
