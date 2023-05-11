package com.car_project;

public class Driver {
	
	public void driver(Car car) {
		
		if(car instanceof Swift) {
			
			car.start();
			car.accelerate();
			car.stop();
		}
		if(car instanceof Audi) {
			
			car.start();
			car.accelerate();
			car.stop();
			
		}
		if(car instanceof Benz) {
			
			car.start();
			car.accelerate();
			car.stop();
		}
		
		if(car instanceof Swift) {
			
			Swift swift = (Swift)car;
			swift.speaker();
			swift.bluetooth();
			swift.airbag();
		}
		
		if(car instanceof Audi) {
			
			Audi audi = (Audi)car;
			audi.speaker();
			audi.bluetooth();
			audi.airbag();
		}
		if(car instanceof Benz) {
			
			Benz benz = (Benz)car;
			benz.speaker();
			benz.bluetooth();
			benz.airbag();
		}
		
}

//	public void driver(Swift swift) {
//		
//		swift.start();
//		swift.accelerate();
//		swift.stop();
//	}
//	public void driver(Audi audi) {
//		
//		audi.start();
//		audi.accelerate();
//		audi.stop();
//	}
//	public void driver (Benz benz) {
//		
//		benz.start();
//		benz.accelerate();
//		benz.stop();
//	}
	
}
