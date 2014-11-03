package com.cs.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.StationPO;
import com.cs.dao.model.StationTablePO;

public interface StationMapper extends BaseMapper{

	public void insertStations(List<StationPO> stations);
	
	public void delStations(int tid);
	
	public List<StationPO> searchStations(HashMap<String, Object> condition);
	
	public void insertTable(StationTablePO stationTablePO);
	
	public void updateTable(StationTablePO stationTablePO);
	
	public void deleteTable(HashMap<String, Object> condition);
	
	public List<StationTablePO> getTables(HashMap<String, Object>condition);
}
