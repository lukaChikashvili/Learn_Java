

public class Main {

	public static void main(String[] args) {
        
         Garage garage = new Garage();
         Car car = new Car("bmw");
         Car car2 = new Car("lamborghini");
         
         garage.park(car);
         garage.park(car2);
   
	}

}
