package com.yourname.Controller;

import com.yourname.Service.StudentService;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Enumeration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yourname.Entity.*;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		
		try {
			System.out.println("Your Host addr: " + InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  // often returns "127.0.0.1"
//	    Enumeration<NetworkInterface> n;
//		try {
//			n = NetworkInterface.getNetworkInterfaces();
//			 for (; n.hasMoreElements();)
//			    {
//			        NetworkInterface e = n.nextElement();
//
//			        Enumeration<InetAddress> a = e.getInetAddresses();
//			        for (; a.hasMoreElements();)
//			        {
//			            InetAddress addr = a.nextElement();
//			            System.out.println("  " + addr.getHostAddress());
//			        }
//			    }
//		} catch (SocketException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		return this.studentService.getAllStudents();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		return this.studentService.getStudentById(id);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id){
		studentService.removeStudentById(id);
	}
	
	
	

}
