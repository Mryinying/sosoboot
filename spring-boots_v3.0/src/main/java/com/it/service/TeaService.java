package com.it.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.it.jooq.generated.tables.pojos.TeacherInfo;

@Service
public interface TeaService {
	
	void insertTea(TeacherInfo info);
	
	List<TeacherInfo> fidTeaList();

}
