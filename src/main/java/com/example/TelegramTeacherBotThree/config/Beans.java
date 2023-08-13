package com.example.TelegramTeacherBotThree.config;

import com.example.TelegramTeacherBotThree.bot.TelegramBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans
{
    @Bean
    public TelegramBot createTelegramBot()
    {
        return new TelegramBot("6386064861:AAExTXTHsGKlrxiKMjrZe1sE_TzhucnPX5E");
    }
}
