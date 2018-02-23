package com.it.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.it.jooq.generated.tables.pojos.DefinedCause;
import com.it.service.CauseService;

@Service
public class CauseServiceImpl implements CauseService {

	@Override
	public List<DefinedCause> findTreeByKeyword(String parentId, String keyword) {
		return null;
	}

}
