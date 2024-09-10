package com.dao;


import java.util.*;

import com.model.EmployeeModel;

public class EmployeeDao {
  EmployeeModel model=new EmployeeModel();
  List<EmployeeModel>list=new ArrayList<>();
  public void dispDetails()
  {
	  for(EmployeeModel emp:list)
	  {
		  System.out.println("Name:"+emp.getName()+"Age:"+emp.getAge()+"Designation:"
	  +emp.getDesignation()+"Department:"+emp.getDepartment());
	  }
  }
}
