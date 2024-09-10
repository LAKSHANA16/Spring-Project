package com.service;


import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dao.RestuarantDao;
import com.dto.RestuarantDto;
import com.model.Restuarant;

public class RestuarantService {
	RestuarantDao restuarantdao=new RestuarantDao();
	public List<Restuarant> fetchDetails(){
		List<Restuarant>list=restuarantdao.fetchDetails();
		return list;
	}
	public List<Restuarant> orderRecords(List<Restuarant> list,String order)
	{
		A a=new A();
		Collections.sort(list,a);
		return list;
	}
	public void updateRestuarant(int eid,String edessert)
	{
		restuarantdao.updateRestuarant(eid,edessert);
	}
	public void deleteRestuarant(String cuisine)
	{
		restuarantdao.deleteRestuarant(cuisine);
	}
	
	}

	class A implements Comparator<Restuarant>
	{

		@Override
		public int compare(Restuarant r1, Restuarant r2) {
			if(r1.getPricePer()>r2.getPricePer())
			return 1;
			if(r1.getPricePer()<r2.getPricePer())
				return -1;
			return 0;
		}
	}


