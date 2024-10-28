package com.cour.dro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cour.dro.entity.Student;

public interface StudentRepo extends JpaRepository<Student , Long>{

}
