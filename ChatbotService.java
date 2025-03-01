package com.codeAlpha.chatBot;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service

public class ChatbotService {

    private final Map<String,String>responses;

    public ChatbotService(){
        responses=new HashMap<>();
        responses.put("hello","Hi! How can I help ? ");
        responses.put("bye","Goodbye! Have a nice day.");
        responses.put("idiot","Goodbye! idiot.");
    }
    public String getResponse(String message){
       if (message == null || message.trim().isEmpty()){
           return "Error: Message cannot be empty";
       }

        return responses.getOrDefault(message.toLowerCase().trim(),"Sorry, I don't Understand.");
    }
}
