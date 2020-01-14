package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService {

    ArrayList<String> messages = new ArrayList<String>(Arrays.asList("hello", "there", "good", "Lord", "whats", "that", "I've never","seen", "anything", "like that"));

    @Override
    public String getMessage() {

        Random r = new Random();

        return messages.get(r.nextInt(10));

    }

}
