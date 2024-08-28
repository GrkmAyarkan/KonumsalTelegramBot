package org.example.konumsaltelegrambot.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.konumsaltelegrambot.bot.KonumsalBot;
import org.example.konumsaltelegrambot.service.BotService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotServiceImpl implements BotService {
    private final KonumsalBot konumsalBot;

    @Override
    public void sendMessage(Long chatId, String message) {
        konumsalBot.sendMessage(chatId, message);
    }
}
