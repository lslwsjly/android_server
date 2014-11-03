package com.cs.facade.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cs.biz.StationManager;
import com.cs.dao.model.StationPO;
import com.cs.dao.model.StationTablePO;
import com.cs.facade.StationFacade;

public class StationFacadeImpl implements StationFacade{

	private StationManager stationService;
	@Override
	public HashMap<String, Object> loadFromCsv(String fileName, int tid) {
		File f = new File(fileName);
		List<StationPO> stations = new ArrayList<StationPO>();
		HashMap<String, Object> result = new HashMap<String, Object>();
		int count = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String tmp = "";
			while((tmp = reader.readLine()) != null) {
				String info[] = tmp.split(",");
				StationPO station = new StationPO();
				station.setLat(Double.parseDouble(info[1]));
				station.setLng(Double.parseDouble(info[0]));
				station.setInfo(info[2]);
				station.setTid(tid);
				stations.add(station);
				count++;
				System.out.println(count+"");
				if(count % 500 ==0) {
					stationService.insertStations(stations);
					stations = new ArrayList<StationPO>();
				}
			}
			stationService.insertStations(stations);
			StationTablePO stable = new StationTablePO();
			stable.setCount(count);
			stable.setId(tid);
			stationService.updateTable(stable);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("result", e.toString());
			
			return result;
		}
		result.put("name", fileName);
		result.put("result", 1);
		return result;
	}

	public final StationManager getStationService() {
		return this.stationService;
	}
	
	public final void setStationService(final StationManager stationService) {
		this.stationService = stationService;
	}

	@Override
	public HashMap<String, Object> listStations(
			HashMap<String, Object> condition) {
		List<StationTablePO> ans = stationService.getTables(condition);
		HashMap<String ,Object> result = new HashMap<String, Object>();
		if(ans == null) {
			result.put("count", 0);
		}else {
			result.put("count", ans.size());
			List<HashMap<String, Object>> data = new ArrayList<HashMap<String,Object>>();
			for(int i = 0;i < ans.size();i++) {
				HashMap<String, Object> item = new HashMap<String, Object>();
				item.put("id", ans.get(i).getId());
				item.put("info", ans.get(i).getInfo());
				item.put("count", ans.get(i).getCount());
				data.add(item);
			}
			result.put("list", data);
		}
		return result;
		
	}

	@Override
	public void delStations(int tid) {
		stationService.delStations(tid);
	}

	@Override
	public void delStationTable(int tid) {
		HashMap<String , Object> condition = new HashMap<String, Object>();
		condition.put("id", tid);
		stationService.deleteTable(condition);
	}

	@Override
	public void insertTable(StationTablePO stationTablePO) {
		stationService.insertTable(stationTablePO);
	}

	@Override
	public HashMap<String, Object> searchStations(
			HashMap<String, Object> condition) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		List<StationPO> ans = stationService.searchStations(condition);
		List<HashMap<String, Object>> stations = new ArrayList<HashMap<String,Object>>();
		if(ans == null) {
			result.put("count", 0);
		} else {
			result.put("count", ans.size());
			for(int i = 0; i < ans.size(); i++) {
				HashMap<String , Object> station = new HashMap<String, Object>();
				station.put("lat", ans.get(i).getLat());
				station.put("lng", ans.get(i).getLng());
				station.put("info", ans.get(i).getInfo());
				stations.add(station);
			}
			result.put("slist", stations);
		}
		return result;
	}

	
}
