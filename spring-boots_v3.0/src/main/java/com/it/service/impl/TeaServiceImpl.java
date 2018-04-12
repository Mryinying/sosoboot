package com.it.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.jooq.generated.tables.daos.TeacherInfoDao;
import com.it.jooq.generated.tables.pojos.TeacherInfo;
import com.it.service.TeaService;

@Service
public class TeaServiceImpl implements TeaService{
	
	@Autowired
	private TeacherInfoDao teacherInfoDao; 

	@Override
	public void insertTea(TeacherInfo info) {
		teacherInfoDao.insert(info);
	}

	@Override
	public List<TeacherInfo> fidTeaList() {
		List<TeacherInfo> list = teacherInfoDao.findAll();
		return list;
	}

}
