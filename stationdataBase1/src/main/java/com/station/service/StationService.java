package com.station.service;

import org.springframework.stereotype.Service;

import com.station.dao.StationDao;
import com.station.model.StationName;

@Service
public class StationService {
	private StationDao stationDao;
	public StationName addStation(StationName name)
	{
		return stationDao.save(name);
	}
	public StationName getStation(String code)
	{
		return stationDao.findOne(code);
	}
	public Iterable<StationName> getAllStation() {
		return stationDao.findAll();
	}
}
