package com.learningPart1.Service;

import com.learningPart1.DAO.StudentDao;
import com.learningPart1.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class StudentService {


    @Autowired
    private StudentDao studetnDao;

    public Collection<Student> getAllStudents()
    {
        return this.studetnDao.getAllStudents();
    }

    public Student getStudentByID(int id)
    {
        return this.studetnDao.getStudentByID(id);
    }

    public Student removeStudentByID(int id) {
       return this.studetnDao.removeStudentByID(id);
    }

    public void updateStudent(Student student)
    {
        this.studetnDao.updateStudent(student);
    }

    public void insertStudent(Student student)
    {
        this.studetnDao.insertStudent(student);
    }


}
