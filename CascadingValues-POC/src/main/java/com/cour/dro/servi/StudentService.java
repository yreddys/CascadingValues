package com.cour.dro.servi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cour.dro.entity.Student;
import com.cour.dro.exception.PleaseProvideValue;
import com.cour.dro.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo stuRepo;

	public Student saveStudent(Student stu) throws PleaseProvideValue {

		// Validate required fields based on course selection
		if ("01".equals(stu.getCourse())) {
			// For course "01", javaSkillLevel and Spring are required
			if (stu.getJavaSkillLevel() == null || stu.getJavaSkillLevel().isEmpty()) {
				throw new PleaseProvideValue("Java skill level must be provided");
			}
			if (stu.getSpring() == null || stu.getSpring().isEmpty()) {
				throw new PleaseProvideValue("Spring must be provided");
			}
		} else if ("02".equals(stu.getCourse())) {
			// For course "02", pythonSkillLevel and Django are required
			if (stu.getPythonSkillLevel() == null || stu.getPythonSkillLevel().isEmpty()) {
				throw new PleaseProvideValue("Python skill level must be provided ");
			}
			if (stu.getDjango() == null || stu.getDjango().isEmpty()) {
				throw new PleaseProvideValue("Django knowledge confirmation must be provided");
			}
		} else {
			throw new PleaseProvideValue("Unsupported course selection. Valid values are '01' or '02'.");
		}

		return stuRepo.save(stu);
	}
}
