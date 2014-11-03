package com.cs.biz.impl;

import java.util.HashMap;
import java.util.List;

import com.cs.biz.StationManager;
import com.cs.dao.mapper.StationMapper;
import com.cs.dao.model.StationPO;
import com.cs.dao.model.StationTablePO;

public class StationManagerImpl implements StationManager{

	/**
     * StationMapper.
     */
    private StationMapper stationMapper;

    /**
     * StationMapper的get方法.
     *
     * @return StationMapper
     */
    public final StationMapper getStationMapper() {
        return this.stationMapper;
    }

    /**
     * StationMapper的set方法.
     *
     * @param newStationMapper
     *            被set的StationMapper
     */
    public final void setStationMapper(final StationMapper stationMapper) {
        this.stationMapper = stationMapper;
    }
	@Override
	public void insertStations(List<StationPO> stations) {
		stationMapper.insertStations(stations);
	}

	@Override
	public List<StationPO> searchStations(HashMap<String, Object> condition) {
		return stationMapper.searchStations(condition);
	}

	@Override
	public void delStations(int tid) {
		stationMapper.delStations(tid);
	}

	@Override
	public void insertTable(StationTablePO stationTablePO) {
		stationMapper.insertTable(stationTablePO);
	}

	@Override
	public void updateTable(StationTablePO stationTablePO) {
		stationMapper.updateTable(stationTablePO);
	}

	@Override
	public void deleteTable(HashMap<String, Object> condition) {
		stationMapper.deleteTable(condition);
	}

	@Override
	public List<StationTablePO> getTables(HashMap<String, Object> condition) {
		return stationMapper.getTables(condition);
	}

}
