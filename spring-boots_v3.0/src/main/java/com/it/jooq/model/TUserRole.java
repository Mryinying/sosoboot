package com.it.jooq.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class TUserRole implements Serializable {

	private static final long serialVersionUID = -928186373;

	private Integer id;
	private Integer userId;
	private Integer roleId;

}
