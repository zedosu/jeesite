/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.statistics.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.statistics.entity.TrendAnalysis;

/**
 * 趋势分析DAO接口
 * @author 张航
 * @version 2017-01-17
 */
@MyBatisDao
public interface TrendAnalysisDao extends CrudDao<TrendAnalysis> {
	public List<Map<String, String>> trendByDate(@Param(value="currentDate") String currentDate, @Param(value="lastDate") String lastDate);
	public List<Map<String, String>> trendByTime();
}