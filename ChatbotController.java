
package com.codeAlpha.chatBot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chatbot")
public class ChatbotController {

    private final ChatbotService chatbotService;

    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping("/ask")
    public String chat(@RequestBody UserInput request) {
        if (request == null || request.getMessage() == null || request.getMessage().trim().isEmpty()) {
            return "Error: Message cannot be empty.";
        }

        return chatbotService.getResponse(request.getMessage());
    }
}
