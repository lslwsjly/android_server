package com.cs.dao.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.cs.dao.model.DataTablePO;

public interface DataMapper extends BaseMapper{
	
	public void excuteSql(@Param("sql") String sql);
	
	public void insertTable(DataTablePO tablePO);
	
	public void updateTable(DataTablePO tablePO);
	
	public void delTable(List<Integer> id);
	
	public List<DataTablePO> getTables(HashMap<String, Object> condition);
	
	public void createTable(@Param("sql") String info);
	
	public List<HashMap<String, Object>> searchData(HashMap<String, Object> condition);
	
	public List<HashMap<String, Object>> getData(HashMap<String, Object> condition);
}
