package com.tns.clients;

import com.tns.entities.student;
import com.tns.service.studentservice;
import com.tns.service.studentserviceimpl;

public class client 
{
	public static void main(String[] args)
	{
		studentservice service = new studentserviceimpl();
		
		student student = new student();
		
		student.setStudentid(100);
		student.setName("Vaishnavi");
		service.addstudent(student);
		
		student = service.findstudentbyId(100);
		System.out.println("ID:"+student.getStudentid());
		System.out.println("Name: "+student.getName());
		
		student = service.findstudentbyId(100);
		student.setName("Vaishnavi");
		service.updatestudent(student);
		
		student = service.findstudentbyId(100);
		System.out.println("ID:"+student.getStudentid());
		System.out.println("Name : "+student.getName());
		
		student = service.findstudentbyId(100);
		service.removestudent(student);
		System.out.println("End of program");
	}

}
