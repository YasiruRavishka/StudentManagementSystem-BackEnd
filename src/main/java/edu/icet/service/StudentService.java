package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    Boolean isExists(Integer id);

    Map getStudent();

    List<Student> getStudent(String name);

    void addStudent(Student student);

    void deleteStudentById(Integer id);
}
