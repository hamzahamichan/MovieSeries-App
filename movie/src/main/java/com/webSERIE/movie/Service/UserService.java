package com.webSERIE.movie.Service;

import com.webSERIE.movie.Model.entity.User;
import com.webSERIE.movie.Rspository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public Optional<User> getUserById(int  id) {
        return userRepo.findById(id);
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(int id) {

    }
}

