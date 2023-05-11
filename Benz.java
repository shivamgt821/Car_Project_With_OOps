public class Benz extends Car{

	@Override
	public void start() {
		
		System.out.println("Benz car touch start");
	}
	@Override
	public void accelerate() {
		
		System.out.println("Benz car Automatic clutch");
	}
	@Override
	public void stop() {
		
		System.out.println("Benz car touch stop");
	}
	public void speaker() {
		
		System.out.println("Benz car speaker");
	}
	public void bluetooth() {
		
		System.out.println("Benz car bluetooth is connected");
	}
	public void airbag() {
		
		System.out.println("Benz car airbag");
	}
}
