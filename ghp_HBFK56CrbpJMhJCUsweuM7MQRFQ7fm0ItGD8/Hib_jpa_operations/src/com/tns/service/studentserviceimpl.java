package com.tns.service;

import com.tns.dao.studentdaoimplementation;
import com.tns.entities.student;

public class studentserviceimpl implements studentservice
{
	private studentdaoimplementation dao;
	
	public void addstudent(student student)
	{
		dao = new studentdaoimplementation();
		dao.beginTransaction();
		dao.addstudent(student);
		dao.commitTranstaction();
	}
	public student findstudentbyId(int id)
	{
		student student=dao.getstudentbyId(id);
		return student;
	}
	public void updatestudent(student student)
	{
		dao.beginTransaction();
		dao.updatestudent(student);
		dao.commitTranstaction();
	}
	public void removestudent(student student)
	{
		dao.beginTransaction();
		dao.removestudent(student);
		dao.commitTranstaction();
	}
}
