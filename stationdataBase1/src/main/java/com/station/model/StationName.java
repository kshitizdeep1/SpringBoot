package com.station.model;
//@Author- Somesh Parida(57495),Kshitish(57),Vinod Kumar Reddy(57530),Ramya.k(57526)
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.train.model.Train;

@Entity(name="Station")
public class StationName 
{
	@Id
	@Column(name="station_code")
	private String stationCode;
	@Column(name="station_name")
	private String stationName;
	@OneToMany
	private Collection<Train> train;
	public String getStationCode()
	{
		return stationCode;
	}
	public void setStationCode(String stationCode) 
	{
		this.stationCode = stationCode;
	}
	public String getStationName() 
	{
		return stationName;
	}
	public void setStationName(String stationName)
	{
		this.stationName = stationName;
	}
	public Collection<Train> getTrain() 
	{
		return train;
	}
	public void setTrain(Collection<Train> train) 
	{
		this.train = train;
	}


}
