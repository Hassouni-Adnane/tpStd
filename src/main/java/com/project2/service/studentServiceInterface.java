package com.project2.service;

import java.util.List;

import com.project2.dto.req;
import com.project2.dto.res;

public interface studentServiceInterface {
	//POST
	public void add(req req);
	//GET
	public List<res> stdClass();
	//GETbyID
	public res stdCode(Integer id);
	//PUT
	public void update(Integer id, req c);
	//DELETE
	public void supprime(Integer id);

}
