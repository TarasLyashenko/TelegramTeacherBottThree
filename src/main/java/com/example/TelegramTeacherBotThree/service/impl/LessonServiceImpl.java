package com.example.TelegramTeacherBotThree.service.impl;

import com.example.TelegramTeacherBotThree.dao.LessonDao;
import com.example.TelegramTeacherBotThree.entity.Lesson;
import com.example.TelegramTeacherBotThree.service.LessonService;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LessonServiceImpl implements LessonService
{

    @Resource
    private LessonDao lessonDao;

    @Override
    public void saveLesson(Lesson lesson)
    {
        lessonDao.save(lesson);
    }
}
