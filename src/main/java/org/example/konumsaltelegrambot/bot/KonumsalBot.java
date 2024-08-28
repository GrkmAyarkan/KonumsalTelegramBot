package org.example.konumsaltelegrambot.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class KonumsalBot extends TelegramLongPollingBot {

    @Value("${bot.name}")
    private String botName;

    @Value("${bot.token}")
    private String botToken;

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update){
        if (update.hasMessage()){
            Message incomeMessage = update.getMessage();
            Long chatId = incomeMessage.getChatId();

            if (incomeMessage.hasText()){
                String text = incomeMessage.getText();

                if (text.equals("/start")){
                    sendMessage(chatId,"Çalışıyorum!");
                }else {
                    sendMessage(chatId,"Anlaşılmadı.");
                }
            }else {
                sendMessage(chatId,"Geçersiz formatta mesaj.");
            }
        }
    }

    public void sendMessage(Long chatId, String messageToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(messageToSend);

        try{
            execute(message);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

}
