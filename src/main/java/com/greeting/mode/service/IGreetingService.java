package com.greeting.mode.service;


import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;

import com.greeting.mode.entity.Greeting;

public interface IGreetingService
{
    Greeting addGreeting(User user);

    Optional<Greeting> findById(long id);

    List<Greeting> getAll();

    Optional<Greeting> editGreetingById(long id, String name);

    void delete(long id);

}