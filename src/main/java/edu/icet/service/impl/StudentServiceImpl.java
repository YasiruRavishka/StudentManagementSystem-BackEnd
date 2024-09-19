package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    final StudentRepository repository;

    @Override
    public Boolean isExists(Integer id) {
        return repository.existsById(id);
    }

    @Override
    public Map getStudent() {
        Map response = new HashMap();
        response.put("studentCount",repository.count());
        response.put("studentList",repository.findAll());
        return response;
    }

    @Override
    public Student getStudent(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }
}
