package com.example.crud.service;

import com.example.crud.entity.Student;

public class StudentService {

	public Object addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.example.crud.service;

import com.example.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query example (optional):
    Student findByEmail(String email);
}