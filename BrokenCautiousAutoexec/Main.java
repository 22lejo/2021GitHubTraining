public class Main {

	public static void main(String[] args)
	{ 
		//Car Object
		Car car = new Car();
		car.print();
    System.out.println("***********************************");
		
		//Toyota Object but called the print method from car class, not the print method in Toyota class
		Toyota toyotaCar = new Toyota();
    System.out.println("The car details are from Car Class.");
		toyotaCar.print();
		System.out.println("***********************************");

		//Toyota Object with Print method from Toyota Class
		Toyota toyotaCar2 = new Toyota();
		toyotaCar2.printDetails();
		System.out.println("***********************************");

		//Create Toyota Object with parameters
		Toyota toyotaCar3 = new Toyota("Silver",2005, 22.7, 56800, "Sedan", true);
		toyotaCar3.printDetails();
		System.out.println("***********************************");


	}

}
