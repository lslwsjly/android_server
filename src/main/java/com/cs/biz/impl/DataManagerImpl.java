package com.cs.biz.impl;

import java.util.HashMap;
import java.util.List;

import com.cs.biz.DataManager;
import com.cs.dao.mapper.DataMapper;
import com.cs.dao.model.DataTablePO;


public class DataManagerImpl implements DataManager {

	private DataMapper dataMapper;
	
	public final DataMapper getDataMapper() {
		return this.dataMapper;
	}
	public void setDataMapper(final DataMapper dataMapper) {
		this.dataMapper = dataMapper;
	}
	
	public void insertTable(DataTablePO tablePO) {
		dataMapper.insertTable(tablePO);
	}

	@Override
	public void updateTable(DataTablePO tablePO) {
		dataMapper.updateTable(tablePO);
	}
	@Override
	public void delTable(List<Integer> id) {
		dataMapper.delTable(id);
		
	}
	@Override
	public List<DataTablePO> getTables(HashMap<String, Object> condition) {
		return dataMapper.getTables(condition);
	}
	@Override
	public void excuteSql(String sql) {
		dataMapper.excuteSql(sql);
	}
	@Override
	public List<HashMap<String, Object>> searchData(
			HashMap<String, Object> condition) {
		
		return dataMapper.searchData(condition);
	}
	@Override
	public List<HashMap<String, Object>> getData(
			HashMap<String, Object> condition) {
		
		return dataMapper.getData(condition);
	}

}
