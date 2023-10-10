package com.Strategy.design;

public class Vehicle {
	
	
	DriveStrategy driveobj ;
	
	Vehicle(DriveStrategy driveobj)
	{
       this.driveobj=driveobj;		
	}
	
	
	


	public void print()
	{
		driveobj.drive();
	}





	}
