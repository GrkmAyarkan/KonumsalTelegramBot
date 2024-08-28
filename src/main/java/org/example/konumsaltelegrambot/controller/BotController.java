package org.example.konumsaltelegrambot.controller;

import lombok.RequiredArgsConstructor;
import org.example.konumsaltelegrambot.entity.Messages;
import org.example.konumsaltelegrambot.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping //http://localhost:8080/konumsalbot
    public void message(@RequestBody String sentMessage) {
        long cheatId = -1002246512817L;
        botService.sendMessage(cheatId, sentMessage);
    }

//    @PostMapping //Bu alan kaldırılacak.
//    public ResponseEntity<Messages> message(@RequestBody Messages message) {
//        long cheatId = -1002246512817L;
//        String sentMessage = message.getText();
//        botService.sendMessage(cheatId, sentMessage);
//
//        // İşlem sonucunu ResponseEntity ile döndürün
//        return ResponseEntity.ok(message);
//    }

}
