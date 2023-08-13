package com.example.TelegramTeacherBotThree.service;

import com.example.TelegramTeacherBotThree.entity.Lesson;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface LessonService
{
    public void saveLesson(Lesson lesson);

    void addLesson(Update update);
}
