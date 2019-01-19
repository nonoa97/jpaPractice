package com.jpapractice.jpa;

import com.jpapractice.jpa.Entity.User;
import com.jpapractice.jpa.Repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandlineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandlineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("Új felhasználó lett létre hozva: " + user);

        Optional<User> userWithId1 =userRepository.findById(1L);
        log.info("Felhasználó lekérve: " + userWithId1);

        List<User> users = userRepository.findAll();
        log.info("Felhasználók: " + users);
    }
}
