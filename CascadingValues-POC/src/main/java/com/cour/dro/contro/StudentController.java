package com.cour.dro.contro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cour.dro.entity.Student;
import com.cour.dro.exception.PleaseProvideValue;
import com.cour.dro.servi.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentServi;
	
	@PostMapping("/save")
	public Student saveStudentcontroller(@RequestBody Student stu) throws PleaseProvideValue {
		return studentServi.saveStudent(stu);
	}

}
