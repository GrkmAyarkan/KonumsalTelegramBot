package org.example.konumsaltelegrambot.controller;

import lombok.RequiredArgsConstructor;
import org.example.konumsaltelegrambot.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/konumsalbot")
@RequiredArgsConstructor
public class BotController {
    private final BotService botService;

    @Value("${chat.id}")
    long chatId;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping //http://localhost:8080/konumsalbot
    public void sendmessage(@RequestBody String message) {
        botService.sendMessage(chatId, message);
    }

}
