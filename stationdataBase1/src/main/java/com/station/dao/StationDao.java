package com.station.dao;

import org.springframework.data.repository.CrudRepository;

import com.station.model.StationName;

public interface StationDao extends CrudRepository<StationName,String> {

}
