package com.it.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.it.api.service.CauseService;
import com.it.service.pojos.DefinedCause;

@Service
public class CauseServiceImpl implements CauseService {

	@Override
	public List<DefinedCause> findTreeByKeyword(String parentId, String keyword) {
		return null;
	}

}
