package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    final StudentService service;

    @GetMapping("/all")
    public Map getStudents() {
        return service.getStudent();
    }

    @GetMapping("/{name}")
    public List<Student> getStudent(@PathVariable String name) {
        return service.getStudent(name);
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student) {
        if (student.getId() != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "InvalidArgument");
        }
        service.addStudent(student);
    }

    @PutMapping("/update")
    public void updateStudentById(@RequestBody Student student) {
        if (student.getId() == null || !service.isExists(student.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "IndexOutOfBoundException");
        }
        service.addStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        if (!service.isExists(id)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "IndexOutOfBoundException");
        }
        service.deleteStudentById(id);
    }
}
