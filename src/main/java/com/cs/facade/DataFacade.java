package com.cs.facade;

import java.util.HashMap;
import java.util.List;
import com.cs.dao.model.DataTablePO;

public interface DataFacade {
	
	public void insertTable(DataTablePO tablePO);
	
	public void updateTable(DataTablePO tablePO);
	
	public void delTable(List<Integer> id);
	
	public HashMap<String, Object> getTables(HashMap<String, Object>condition);
	
	public HashMap<String, Object> loadFromCsv(String filename, int tabid);
	
	public void delData(int tabid);
	
	public HashMap<String, Object> searchData(HashMap<String, Object> condition);
	
	public HashMap<String, Object> getData(HashMap<String, Object> condition);
	
	public HashMap<String, Object> areaSearch(HashMap<String, Object> condition);
}
