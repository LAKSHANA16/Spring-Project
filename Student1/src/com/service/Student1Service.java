package com.service;

import java.util.List;

import com.dao.Student1Dao;
import com.model.Student1;

public class Student1Service {
	Student1Dao student1Dao=new Student1Dao();
	public List<Student1> fetchAll(){
		List<Student1>list=student1Dao.fetchAll();
		return list;
	}
}
