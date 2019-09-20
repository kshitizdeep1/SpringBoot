package com.train.dao;

import org.springframework.data.repository.CrudRepository;

import com.train.model.Train;

public interface TrainDao extends CrudRepository<Train,Integer> {

}
