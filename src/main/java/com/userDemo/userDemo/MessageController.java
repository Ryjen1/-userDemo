package com.userDemo.userDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/message1")
    public String getMessage1() throws IOException {
        return messageService.getAllMessages1();
    }

    @GetMapping("/message2")
    public String getMessage2() throws IOException {
        return messageService.getAllMessages2();
    }

    @GetMapping("/getCount")
    public int getMessageCount() throws IOException {
        return messageService.getMessageCount();
    }

    @PostMapping("/post")
    public void postMessage(@RequestBody String message) throws IOException {
        messageService.postMessage(message);
    }
}
