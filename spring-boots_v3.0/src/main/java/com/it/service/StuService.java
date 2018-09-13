package com.it.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.it.jooq.generated.tables.pojos.StudentInfo;

@Service
public interface StuService {
	
	void insertStu(StudentInfo info);
	
	List<StudentInfo> fidStuList();
	
	public abstract StudentInfo findById(Integer id);

}
