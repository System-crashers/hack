package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class UserController {

    // List of random silly/stupid replies
    private List<String> replies = Arrays.asList(
        "Huh? What?",
        "I dunno 🤷",
        "Blah blah blah...",
        "Me confused 🤯",
        "Banana!",
        "Wait, what did you say?",
        "I only speak gibberish!",
        "Oops… I forgot what you said 😅",
        "Are we even talking? 🤔",
        "LOL, what?"
    );

    private Random random = new Random();

    @PostMapping("/chat")
    public String chat(@RequestBody Map<String, String> payload) {
        int index = random.nextInt(replies.size()); // pick a random reply
        return replies.get(index);
    }
}