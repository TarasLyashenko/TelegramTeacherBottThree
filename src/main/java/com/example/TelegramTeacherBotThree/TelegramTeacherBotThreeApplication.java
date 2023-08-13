package com.example.TelegramTeacherBotThree;

import com.example.TelegramTeacherBotThree.bot.TelegramBot;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class TelegramTeacherBotThreeApplication implements CommandLineRunner
{
    @Resource
    private TelegramBot telegramBot;

    public static void main(String[] args)
    {
        SpringApplication.run(TelegramTeacherBotThreeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

    }

    @PostConstruct
    public void registerBot()
    {
        try
        {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(telegramBot);
        }
        catch (TelegramApiException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
