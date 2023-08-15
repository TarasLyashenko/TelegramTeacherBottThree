package com.example.TelegramTeacherBotThree.service.impl;

import com.example.TelegramTeacherBotThree.dao.StudentDao;
import com.example.TelegramTeacherBotThree.entity.Student;
import com.example.TelegramTeacherBotThree.service.StudentService;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl implements StudentService
{
    @Resource
    private StudentDao studentDao;

    @Override
    public void saveStudent(Student student)
    {
        studentDao.save(student);
    }

    @Override
    public String seeAllStudent()
    {
        StringBuilder responseBuilder = new StringBuilder();

        Iterable<Student> all = studentDao.findAll();
        for (Student student : all)
        {
            long id = student.getId();
            String name = student.getName();
            String classroom = student.getClassroom();

            responseBuilder.append(name).append(" ").append(classroom).append("\n");
        }
        return responseBuilder.toString();
    }
}
