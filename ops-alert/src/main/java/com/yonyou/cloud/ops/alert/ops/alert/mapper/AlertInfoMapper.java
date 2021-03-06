package com.yonyou.cloud.ops.alert.ops.alert.mapper;

import java.util.List;

import com.yonyou.cloud.ops.alert.ops.alert.entity.AlertInfo;

import tk.mybatis.mapper.common.Mapper;

public interface AlertInfoMapper extends Mapper<AlertInfo> {
	public List<AlertInfo> selectAlertAndGroupByStatus(String status);
}