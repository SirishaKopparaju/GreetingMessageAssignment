package com.greeting.mode.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greeting.mode.entity.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
