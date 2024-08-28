package org.example.konumsaltelegrambot.bot;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
public class KonumsalBotInitializer {
    private final KonumsalBot konumsalBot;
    public KonumsalBotInitializer(KonumsalBot konumsalBot) {
        this.konumsalBot = konumsalBot;
    }

    @EventListener({ContextRefreshedEvent.class})
    public void init(){
        try{
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(konumsalBot);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

}
