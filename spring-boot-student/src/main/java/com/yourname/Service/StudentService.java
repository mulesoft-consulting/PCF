package com.yourname.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yourname.Dao.StudentDao;
import com.yourname.Entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student>getAllStudents(){
		return this.studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id){
		return this.studentDao.getStudentById(id);
	}

	public void removeStudentById(int id) {
		this.studentDao.removeStudentById(id);
		
	}
}
