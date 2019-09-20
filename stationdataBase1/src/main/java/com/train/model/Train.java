package com.train.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Column(name="train_name")
	private String trainName;
	@Id
	@Column(name="train_number")
	private int trainNumber;
	@Column(name="train_source")
	private String trainSource;
	@Column(name="train_destination")
	private String trainDestination;
	@Column(name="day_of_journey")
	private String dayOfJourney;
	public String getTrainName() 
	{
		return trainName;
	}
	public void setTrainName(String trainName) 
	{
		this.trainName = trainName;
	}
	public int getTrainNumber()
	{
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) 
	{
		this.trainNumber = trainNumber;
	}
	public String getTrainSource()
	{
		return trainSource;
	}
	public void setTrainSource(String trainSource) 
	{
		this.trainSource = trainSource;
	}
	public String getTrainDestination() 
	{
		return trainDestination;
	}
	public void setTrainDestination(String trainDestination) 
	{
		this.trainDestination = trainDestination;
	}
	public String getDayOfJourney() 
	{
		return dayOfJourney;
	}
	public void setDayOfJourney(String dayOfJourney)
	{
		this.dayOfJourney = dayOfJourney;
	}

}
