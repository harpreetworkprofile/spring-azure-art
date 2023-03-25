package com.example.hi;

import com.example.model.Greeting;
import com.example.model.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Hi implements Function<User, Greeting> {

    @Override
    public Greeting apply(User user) {
        return new Greeting("Hi, " + user.getName() + "!\n");
    }
}