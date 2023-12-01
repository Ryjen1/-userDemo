package com.userDemo.userDemo;

import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class MessageService {

    private final String MESSAGE_FILE = "message.txt";
    private final String LOG_FILE = "log.txt";

    public String getAllMessages1() throws IOException {

        return "Hello Java, please be nice";
    }
    public String getAllMessages2() throws IOException {

        return "Hello , please be nice";
    }


    public int getMessageCount() throws IOException {

        return 0;
    }

    public void postMessage(String message) throws IOException {
        // Implement logic to store the message in the file
        // Log activity
        logActivity("New message created");
    }

    private void logActivity(String logMessage) throws IOException {
        // Implement logic to log activity to the log file
    }
}

