package com.rabi.JPA_Project_01.service;

import com.rabi.JPA_Project_01.entity.Student;
import com.rabi.JPA_Project_01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	List<Student> studentList = new ArrayList<>();
	
	public Student createStudent(Student student){
		return studentRepo.save(student);
	}
	
	public List<Student> getAllStudents(){
		studentList = studentRepo.findAll();
		return studentList;
	}
	
	public Student getStudentById(int id){
		Optional<Student> byId = studentRepo.findById(id);
		return byId.get();
	}
	
	public Student update(int id, Student student){
		Optional<Student> studentById = studentRepo.findById(id);
		if(studentById.isPresent())
		{
			Student dbStudentObject = studentById.get();
			dbStudentObject.setAge(student.getAge());
			dbStudentObject.setEmail(student.getEmail());
			dbStudentObject.setName(student.getName());
			dbStudentObject.setAddress(student.getAddress());
			return studentRepo.save(dbStudentObject);
		}
		else {
			System.out.println("Data not present in db....");
		}
		return null;
	}
	
	public Student partialUpdate(int id, Student student) {
		Optional<Student> studentById = studentRepo.findById(id);
		
		if (studentById.isPresent()) {
			Student dbStudentObject = studentById.get();
			
			if (student.getName() != null && !student.getName().isEmpty()) {
				dbStudentObject.setName(student.getName());
			}
			if (student.getEmail() != null && !student.getEmail().isEmpty()) {
				dbStudentObject.setEmail(student.getEmail());
			}
			if (student.getAge() > 0) {
				dbStudentObject.setAge(student.getAge());
			}
			if (student.getAddress() != null && !student.getAddress().isEmpty()) {
				dbStudentObject.setAddress(student.getAddress());
			}
			
			return studentRepo.save(dbStudentObject);
		} else {
			System.out.println("Data not present in DB...");
			return null;
		}
	}
	
	
	
	public void delete(int id){
		 studentRepo.deleteById(id);
	}
	
}
