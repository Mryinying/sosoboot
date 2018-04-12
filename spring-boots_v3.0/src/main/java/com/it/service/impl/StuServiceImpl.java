package com.it.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.jooq.generated.tables.daos.StudentInfoDao;
import com.it.jooq.generated.tables.pojos.StudentInfo;
import com.it.service.StuService;

@Service
public class StuServiceImpl implements StuService{
	
	@Autowired
	private StudentInfoDao studentInfoDao; 

	@Override
	public void insertStu(StudentInfo info) {
		studentInfoDao.insert(info);
	}

	@Override
	public List<StudentInfo> fidStuList() {
		List<StudentInfo> list = studentInfoDao.findAll();
		return list;
	}

}