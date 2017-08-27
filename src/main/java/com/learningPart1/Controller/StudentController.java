package com.learningPart1.Controller;

import com.learningPart1.Entity.Student;
import com.learningPart1.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents()
    {

        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{foo}", method = RequestMethod.GET)
    public Student getStudentByID(@PathVariable("foo") int id)
    {
        return studentService.getStudentByID(id);
    }

    @RequestMapping(value = "/{foo1}", method = RequestMethod.DELETE)
    public Collection<Student> removeStudentByID(@PathVariable("foo1") int id)
    {
        studentService.removeStudentByID(id);
        return studentService.getAllStudents();
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Student> updateStudent(@RequestBody Student student)
    {
        studentService.updateStudent(student);
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Student> insertStudent(@RequestBody Student student)
    {
        studentService.insertStudent(student);
        return studentService.getAllStudents();
    }

}
