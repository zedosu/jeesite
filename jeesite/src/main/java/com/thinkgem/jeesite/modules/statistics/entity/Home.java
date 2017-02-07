/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.statistics.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * homeEntity
 * @author 张航
 * @version 2017-01-17
 */
public class Home extends DataEntity<Home> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// name
	
	public Home() {
		super();
	}

	public Home(String id){
		super(id);
	}

	@Length(min=0, max=100, message="name长度必须介于 0 和 100 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}