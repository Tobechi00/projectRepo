package com.beginner.student_management_app.repository;

import com.beginner.student_management_app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long>{

}
