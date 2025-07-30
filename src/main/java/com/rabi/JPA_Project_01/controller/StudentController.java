package com.rabi.JPA_Project_01.controller;

import com.rabi.JPA_Project_01.entity.Student;
import com.rabi.JPA_Project_01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student){
		return service.createStudent(student);
	}
	
	@GetMapping("/get-all")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/get")
	public Student getStudentById(@RequestParam int id){
		return service.getStudentById(id);
	}
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Integer id){
		return service.getStudentById(id);
	}
	/*
	There are diff ways to get by id
	1 - @RequestParam -- url : http://localhost:9090/api/student/get?id=1
	2 - @PathVariable -- url : http://localhost:9090/api/student/6
	 */
	@PutMapping("update/{id}")
	public Student update(@PathVariable int id, @RequestBody Student student){
		return service.update(id, student);
	}
	
	@PatchMapping("update/{id}")
	public Student partialUpdate(@PathVariable int id, @RequestBody Student student){
		return service.partialUpdate(id, student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id){
		 service.delete(id);
	}
}
