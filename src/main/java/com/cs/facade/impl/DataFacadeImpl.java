package com.cs.facade.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cs.biz.DataManager;
import com.cs.dao.model.DataTablePO;
import com.cs.facade.DataFacade;

public class DataFacadeImpl implements DataFacade {

	private DataManager dataService;

	public final DataManager getDataService() {
		return this.dataService;
	}
	public void setDataService(final DataManager dataService) {
		this.dataService = dataService;
	}

	@Override
	public void insertTable(DataTablePO tablePO) {
		dataService.insertTable(tablePO);
		String sql = "CREATE TABLE table"+tablePO.getId()+"(id int NOT NULL AUTO_INCREMENT,PRIMARY KEY (id));";
		dataService.excuteSql(sql);
//		String sql = "CREATE TABLE table"+tablePO.getId()+"(id int NOT NULL AUTO_INCREMENT,PRIMARY KEY (id),";
//		switch(tablePO.getType()) {
//		case 0:
//		case 2:
//			break;
//		case 1:
//			sql = sql + "lat double NOT NULL, lng double NOT NULL, col1 varchar(300) NOT NULL, col2 double NOT NULL";
//			break;
//		case 3:
//			sql = sql + "lat double NOT NULL, lng double NOT NULL, col1 varchar(300) NOT NULL, col2 varchar(300) NOT NULL, col3 int NOT NULL";
//			break;
//		}
//		sql = sql + ");";
//		dataService.excuteSql(sql);
//		return tablePO.getId();
	}

	@Override
	public void updateTable(DataTablePO tablePO) {
		dataService.updateTable(tablePO);
		
	}

	@Override
	public void delTable(List<Integer> id) {
		dataService.delTable(id);
		for(int i = 0;i < id.size();i++) {
			dataService.excuteSql("DROP TABLE table" + id.get(i));
		}
	}
	@Override
	public HashMap<String, Object> getTables(HashMap<String, Object> condition) {
		List<DataTablePO> ans = dataService.getTables(condition);
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
				item.put("time", ans.get(i).getTimes());
				item.put("name", ans.get(i).getNames());
				List<String> tmp1 = new ArrayList<String>();
				String []tp1 = ans.get(i).getTimes().split(",");
				for(int j = 0;j < tp1.length;j++) {
					tmp1.add(tp1[j]);
				}
				List<String> tmp2 = new ArrayList<String>();
				String []tp2 = ans.get(i).getNames().split(",");
				for(int j = 0;j < tp2.length;j++) {
					tmp2.add(tp2[j]);
				}
				item.put("times", tmp1);
				item.put("names", tmp2);
				item.put("empty", ans.get(i).getEmpty());

				data.add(item);
			}
			result.put("list", data);
		}
		return result;
	}
	
	
	
	@Override
	public HashMap<String, Object> loadFromCsv(String filename, int tabid) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		dataService.excuteSql("DROP TABLE table" + tabid);
		String sql = "CREATE TABLE table"+tabid+"(id int NOT NULL AUTO_INCREMENT,PRIMARY KEY (id),lat double NOT NULL, lng double NOT NULL";
		try {
			File f = new File(filename);
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String tmp = "";
			tmp = reader.readLine();
			String info[] = tmp.split(",");
			int size = info.length - 2;
			for(int i =0;i < size;i++) {
				sql+=",col"+i+" double NOT NULL";
			}
			sql += ");";
			dataService.excuteSql(sql);
			tmp = reader.readLine();
			sql = "INSERT INTO table" + tabid + "(lng,lat";
			for (int i = 0;i < size;i++){
				sql += ",col"+i;
			}
			sql += ") VALUES";
			int count = 1;
			
			info = tmp.split(",");
			sql += "(" + info[0];
			for (int i =1;i < size + 2;i++) {
				sql += ","+info[i];
			}
			sql += ")";	
			while((tmp = reader.readLine()) != null) {
				count ++;
				System.out.println(count+"");
				if(count % 503 ==0) {
					sql += ";";
//					System.out.println(sql);
					dataService.excuteSql(sql);
					sql = "INSERT INTO table" + tabid + "(lng,lat";
					for (int i = 0;i < size;i++){
						sql += ",col"+i;
					}
					sql += ") VALUES";
					info = tmp.split(",");
					info = tmp.split(",");
					sql += "(" + info[0];
					for (int i =1;i < size + 2;i++) {
						sql += ","+info[i];
					}
					sql += ")";
					continue;
				}
				info = tmp.split(",");
				sql += ",(" + info[0];
				for (int i =1;i < size + 2;i++) {
					sql += ","+info[i];
				}
				sql += ")";
				
			}
			sql += ";";
			dataService.excuteSql(sql);
			DataTablePO tp = new DataTablePO();
			tp.setId(tabid);
			tp.setEmpty(1);
			dataService.updateTable(tp);
			reader.close();
			return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			result.put("error", e.toString());
			return result;
		}
	}
	@Override
	public void delData(int tabid) {
		String sql = "DELETE FROM table" + tabid;
		dataService.excuteSql(sql);
	}
	@Override
	public HashMap<String, Object> searchData(HashMap<String, Object> condition) {
		List<HashMap<String, Object>> ans = dataService.searchData(condition);
		double rad = (Double) condition.get("rad");
		int type = (Integer) condition.get("type");
		int start = (Integer) condition.get("start");
		int pace = (Integer) condition.get("pace");
		String []cols = ((String)condition.get("cols")).split(",");
		HashMap<String, Object> result = new HashMap<String, Object>();
		if(ans.size() == 0) {
			result.put("count", 0);
		} else {
			List<HashMap<String, Object>> data = new ArrayList<HashMap<String,Object>>();
			double lng=0,lat=0,dat=0;
			double max = -1000000, min = 1000000;
			for(int i = start;i < ans.size();i+=pace) {
				double lngt = (Double) ans.get(i).get("lng");
				double latt = (Double) ans.get(i).get("lat");
				if(Math.abs(lngt - lng) + Math.abs(latt - lat) > rad) {
					if(lng!=0) {
						HashMap<String, Object> tmp = new HashMap<String, Object>();
						tmp.put("lng", lng);
						tmp.put("lat", lat);
						tmp.put("val", dat);
						data.add(tmp);
						if(dat > max)
							max = dat;
						if(dat < min)
							min = dat;
					}
					lng = lngt;
					lat = latt;
					dat = 0;
				}
				if(type == 0) {
					for(int j = 0;j < cols.length;j++) {
						dat += (Double) ans.get(i).get(cols[j]);
					}
				}
				if(type == 1) {
					dat += (Double) ans.get(i).get(cols[0]) - (Double) ans.get(i).get(cols[1]);
				}
			}
			if(lng!=0) {
				HashMap<String, Object> tmp = new HashMap<String, Object>();
				tmp.put("lng", lng);
				tmp.put("lat", lat);
				tmp.put("val", dat);
				data.add(tmp);
			}
			result.put("max", max);
			result.put("min", min);
			result.put("count", data.size());
			result.put("dlist", data);
		}
		return result;
	}
	@Override
	public HashMap<String, Object> getData(HashMap<String, Object> condition) {
		List<HashMap<String, Object>> ans = dataService.getData(condition);
		HashMap<String, Object> result = new HashMap<String, Object>();
		if(ans.size() == 0) {
			result.put("count", 0);
		} else {
			
			result.put("count", ans.size());
			result.put("dlist", ans);
		}
		return result;
	}
	@Override
	public HashMap<String, Object> areaSearch(HashMap<String, Object> condition) {
		List<HashMap<String, Object>> ans = dataService.searchData(condition);
		int count = (Integer) condition.get("count");
		int pace = (Integer) condition.get("pace");
		HashMap<String, Object> result = new HashMap<String, Object>();
		if(ans.size() == 0) {
			result.put("count", 0);
		} else {
			List<HashMap<String, Object>> data = new ArrayList<HashMap<String,Object>>();
			for(int i = 0; i < pace; i++) {
				HashMap<String, Object> tmp = new HashMap<String, Object>();
				for(int j = 0;j < count; j++) {
					tmp.put("col"+j, 0.0);
				}
				data.add(tmp);
			}
			for(int i = 0; i < pace; i ++) {
				for(int j = i;j < ans.size();j += pace) {
					for(int k = 0;k < count; k++) {
						data.get(i).put("col" + k, (Double) data.get(i).get("col" + k) + (Double) ans.get(j).get("col" + k));
					}
				}
			}
			result.put("count", ans.size() / pace);
			result.put("dlist", data);
		}
		return result;
	}
	
	
	
}
