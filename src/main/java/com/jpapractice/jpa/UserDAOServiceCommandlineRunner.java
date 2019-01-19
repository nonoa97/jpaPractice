package com.jpapractice.jpa;

import com.jpapractice.jpa.Entity.User;
import com.jpapractice.jpa.Service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandlineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandlineRunner.class);

    @Autowired
    private UserDAOService userDAOService;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
      long insert =  userDAOService.insert(user);
      log.info("Új felhasználó lett létre hozva: "+user);
    }
}
