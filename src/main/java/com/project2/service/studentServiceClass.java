package com.project2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project2.dto.req;
import com.project2.dto.res;
import com.project2.entities.student;
import com.project2.mapper.studentInterfaceMap;
import com.project2.repositories.studentRepo;

@Service
@Transactional
public class studentServiceClass implements studentServiceInterface {

	@Autowired
	public studentRepo stdRepo;
	//@Autowired
	public studentInterfaceMap stdMap;
	
	@Override
	public void add(req req1) {

		student s = new student();
		s = studentInterfaceMap.stdReq(req1);
		stdRepo.save(s);
		
	}
	@Override
	public List<res> stdClass() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public res stdCode(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Integer id, req c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void supprime(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
