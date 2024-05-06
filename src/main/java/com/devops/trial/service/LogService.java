package com.devops.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.trial.domain.Login;
import com.devops.trial.repository.LogRepo;



@Service
public class LogService {

    @Autowired
    private LogRepo rep;

    public Login log(String username , String password){
        Login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}
