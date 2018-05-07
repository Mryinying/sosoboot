package com.it.api.service;

import java.util.List;

import com.it.service.pojos.DefinedCause;


public interface CauseService {

	public List<DefinedCause> findTreeByKeyword(String parentId, String keyword);
}
