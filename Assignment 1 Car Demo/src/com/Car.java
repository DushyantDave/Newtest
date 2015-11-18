package com;

public class Car {
	private String make;
	private String model;
	private int passengerCapacity;
	private double onRoadPrice;
	public Car(String make, String model, int passengerCapacity, double onRoadPrice)
	{
		this.make = make;
		this.model = model;
		this.passengerCapacity = passengerCapacity;
		this.onRoadPrice = onRoadPrice;
	}
	public int getpassengerCapacity()
	{
		return passengerCapacity;
	}
	public void setpassengerCapacity(int passengerCapacity)
	{
		this.passengerCapacity = passengerCapacity; 
	}
	public double getOnRoadPrice()
	{
		return onRoadPrice;
	}
	public void setOnRoadPrice(double onRoadPrice)
	{
		this.onRoadPrice = onRoadPrice;
	}
	public String getMake()
	{
		return make;
	}
	public String getModle()
	{
		return model;
	}
}
