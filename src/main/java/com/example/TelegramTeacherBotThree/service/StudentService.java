package com.example.TelegramTeacherBotThree.service;

import com.example.TelegramTeacherBotThree.entity.Student;

public interface StudentService
{
    void saveStudent(Student student);

    String seeAllStudent();
}
