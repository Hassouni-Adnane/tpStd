package com.project2.mapper;

import org.springframework.beans.BeanUtils;

import com.project2.dto.res;
import com.project2.entities.student;

public class studentClassMap implements studentInterfaceMap {

	@Override
	public com.project2.dto.res res(com.project2.dto.res res) {
		res cp = new res();
		BeanUtils.copyProperties(res, cp);
		return cp;
	}

	@Override
	public student stdReq(com.project2.dto.req req) {
		student s = new student();
		s.setName(req.getName());
		s.setClasse(req.getClasse());
		s.setCode(req.getCode());
		return s;
	}

}
