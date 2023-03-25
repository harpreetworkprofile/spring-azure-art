package com.example.hello;

import com.example.model.Greeting;
import com.example.model.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Hey implements Function<User, Greeting> {

    @Override
    public Greeting apply(User user) {
        return new Greeting("Hey, " + user.getName() + "!\n");
    }
}