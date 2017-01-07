package com.yourname.Dao;

import java.net.UnknownHostException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yourname.Entity.Student;

@Repository

public class StudentDao {
	
	private static	Map<Integer, Student> students;
	
	static{
		try {
			students = new HashMap<Integer, Student>(){
				{
					put(1,new Student(1,"Neerav","Computer Science"));
					put(2,new Student(2,"Sumeet","Finance"));
					put(3,new Student(3,"Molly","Law"));
					put(4,new Student(4,"Nina","Sales"));
				}
			};
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Collection<Student> getAllStudents(){
		return StudentDao.students.values();
	}

	public Student getStudentById(int id){
		return StudentDao.students.get(id);
	}

	public Object removeStudentById(int id) {
		StudentDao.students.remove(id);
		return null;
	}
	
}
