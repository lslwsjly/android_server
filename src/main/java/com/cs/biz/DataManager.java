package com.cs.biz;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.DataTablePO;

public interface DataManager extends BaseManager{
	
	public void excuteSql(String sql);
	
	public void insertTable(DataTablePO tablePO);
	
	public void updateTable(DataTablePO tablePO);
	
	public void delTable(List<Integer> id);
	
	public List<DataTablePO> getTables(HashMap<String, Object>condition);
	
	public List<HashMap<String, Object>> searchData(HashMap<String, Object> condition);
	
	public List<HashMap<String, Object>> getData(HashMap<String, Object> condition);
	
}
