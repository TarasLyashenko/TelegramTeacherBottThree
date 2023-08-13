package com.example.TelegramTeacherBotThree.dao;

import com.example.TelegramTeacherBotThree.entity.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonDao extends CrudRepository<Lesson, Long>
{
    Lesson findByTitle(String title);
}
