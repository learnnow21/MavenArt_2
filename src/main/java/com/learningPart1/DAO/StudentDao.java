package com.learningPart1.DAO;

import com.learningPart1.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentDao
{

    private static Map<Integer, Student> students;


    static
    {
        students = new HashMap<Integer, Student>()
        {

            {
                put(1, new Student(1, "Abhinav", "Information Technology"));
                put(2, new Student(2, "Abhimanyu", "Tibco"));
                put(3, new Student(3, "Ankita", "Masters of Business Administration"));
            }

        };
    }

        public Collection<Student> getAllStudents()
        {
            return this.students.values();
        }

        public Student getStudentByID(int id)
        {
            return  this.students.get(id);
        }

        public Student removeStudentByID(int id)
        {
             return this.students.remove(id);
        }

        public void updateStudent(Student student)
        {
            Student s = students.get(student.getId());
            s.setCourse(student.getCourse());
            s.setName(student.getName());
            // s.setId(student.getId());
            students.put(student.getId(),student);
        }

    public void insertStudent(Student student)
    {

        this.students.put(student.getId(),student);
    }


}
