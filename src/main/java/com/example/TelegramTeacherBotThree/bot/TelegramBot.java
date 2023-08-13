package com.example.TelegramTeacherBotThree.bot;

import com.example.TelegramTeacherBotThree.service.LessonService;
import jakarta.annotation.Resource;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot
{
    @Resource
    private LessonService lessonService;

    public TelegramBot(String token)
    {
        super(token);
    }

    @Override
    public void onUpdateReceived(Update update)
    {
        lessonService.addLesson(update);
    }

    @Override
    public String getBotUsername()
    {
        return "TestTelergam_bot";
    }
}
