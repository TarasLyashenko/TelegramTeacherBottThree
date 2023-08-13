package com.example.TelegramTeacherBotThree.service.impl;

import com.example.TelegramTeacherBotThree.dao.LessonDao;
import com.example.TelegramTeacherBotThree.entity.Lesson;
import com.example.TelegramTeacherBotThree.service.LessonService;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@Transactional
public class LessonSeviceImpl implements LessonService
{

    @Resource
    private LessonDao lessonDao;

    @Override
    public void saveLesson(Lesson lesson)
    {
        lessonDao.save(lesson);
    }

    @Override
    public void addLesson(Update update)
    {
        Message message = update.getMessage();
        if (message.getText().startsWith("ДобавитьЛекцию"))
        {
            String[] parts = message.getText().split(" ");
            if (parts.length == 3)
            {
                String title = parts[1];
                int numberHours = Integer.parseInt(parts[2]);

                Lesson lesson = new Lesson(title, numberHours);
                saveLesson(lesson);
            }
        }
    }
}
