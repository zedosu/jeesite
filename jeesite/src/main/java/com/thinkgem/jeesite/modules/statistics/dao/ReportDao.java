/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.statistics.dao;

import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 网站概述DAO接口
 * @author 张航
 * @version 2017-01-17
 */
@MyBatisDao
public interface ReportDao {

	List<Map<String, String>> topTenPageByDay(@Param(value = "currentDate") String currentDate,
                                              @Param(value = "day") Integer day);

	List<Map<String, String>> reportByDayList();


}