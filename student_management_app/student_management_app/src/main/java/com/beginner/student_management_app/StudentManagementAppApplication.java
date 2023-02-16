package com.beginner.student_management_app;

import com.beginner.student_management_app.entity.Student;
import com.beginner.student_management_app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementAppApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Tobechi","Okaro","tobechiokaro@gmail.com");
		studentRepository.save(student1);

		Student student2=new Student("James","Uche","jamesuche@gmail.com");
		studentRepository.save(student2);

		Student student3=new Student("John","Ulo","johnulo@gmail.com");
		studentRepository.save(student3);
	}
}
