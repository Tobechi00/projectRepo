package com.beginner.student_management_app.service.impl;

import com.beginner.student_management_app.entity.Student;
import com.beginner.student_management_app.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements com.beginner.student_management_app.service.StudentService {

    private StudentRepository studentRepository;

    public StudentServiceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);

    }
}
