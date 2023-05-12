public class Engine_Operator {

	public static void main(String[] args) {
		Driver driver1 = new Driver();
	//driver1.driver(new Audi());	
		Car car = (new Swift()); // abstract class cant be created 
		
	//	driver1.driver(new Benz());
	//	driver1.driver(new Audi());
		driver1.driver(new Swift());
	}

}
