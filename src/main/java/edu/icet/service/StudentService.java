package edu.icet.service;

import edu.icet.dto.Student;

import java.util.Map;

public interface StudentService {
    Boolean isExists(Integer id);

    Map getStudent();

    Student getStudent(Integer id);

    void addStudent(Student student);

    void deleteStudentById(Integer id);
}
