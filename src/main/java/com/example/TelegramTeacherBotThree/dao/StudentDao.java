package com.example.TelegramTeacherBotThree.dao;

import com.example.TelegramTeacherBotThree.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student, Long>
{
    Student findByName(String name);
    Student findByClassroom(String classroom);
}
