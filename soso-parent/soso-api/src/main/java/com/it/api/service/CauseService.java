package com.it.service;

import java.util.List;

import com.it.jooq.generated.tables.pojos.DefinedCause;

public interface CauseService {

	public List<DefinedCause> findTreeByKeyword(String parentId, String keyword);
}
