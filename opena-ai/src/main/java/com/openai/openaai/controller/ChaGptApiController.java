package com.openai.openaai.controller;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat-gpt-api")
public class ChaGptApiController {
    private final OpenAiChatClient openAiChatClient;

    public ChaGptApiController(OpenAiChatClient openAiChatClient) {
        this.openAiChatClient = openAiChatClient;
    }

    @GetMapping("/information")
    public String getFromGpt(@RequestParam (value = "message", defaultValue = "Liste os 10 melhores livros do último ano") String message){

        return openAiChatClient.call(message);
    }
}
