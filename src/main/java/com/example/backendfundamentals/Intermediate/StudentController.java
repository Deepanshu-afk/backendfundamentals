package com.example.backendfundamentals.Intermediate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/students")
public interface StudentController {

    @PostMapping
    <Student>
    ResponseEntity<Student> addStudent(@RequestBody Student student);

    @GetMapping("/{id}")
    <Student>
    ResponseEntity<Student> getStudentById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteStudent(@PathVariable Long id);
}
