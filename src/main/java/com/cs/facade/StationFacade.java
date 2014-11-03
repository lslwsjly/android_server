package com.cs.facade;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.StationTablePO;

public interface StationFacade extends BaseFacade{

	public HashMap<String, Object> loadFromCsv(String fileName, int tid);
	
	public HashMap<String, Object> listStations(HashMap<String, Object> condition);
	
	public void delStations(int tid);
	
	public void delStationTable(int tid);
	
	public void insertTable(StationTablePO stationTablePO);
	
	public HashMap<String, Object> searchStations(HashMap<String, Object> condition);
}
