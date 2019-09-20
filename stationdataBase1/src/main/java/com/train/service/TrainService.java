package com.train.service;



import org.springframework.stereotype.Service;

import com.train.dao.TrainDao;
import com.train.model.Train;

@Service
public class TrainService  {

	private TrainDao trainDao;
	
	public Train addTrain(Train train) {
		return trainDao.save(train);
	}
	
	public Train getTrain(Integer id)
	{
		return trainDao.findOne(id);
	}
	
	public Iterable<Train> getAllTrain()
	{
		return trainDao.findAll();
	}
	
	public void deleteTrain(Integer id) {
		trainDao.delete(id);
	}
	
	
	
}
