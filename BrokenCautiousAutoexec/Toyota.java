public class Toyota extends Car 
{

	String modelType;
	boolean isStickGear;
	double milage;
	double price;
	
	public Toyota()
	{
		super();
	    modelType = "Camry";
	    isStickGear = false;
		this.milage = 30;
		this.price = 50000;
	}
	
	public Toyota(String color, int year, double milage, double price, String modelType, boolean isStickGear)
	{
		super(color, year);
		this.milage = milage; 
		this.price = price;
		this.modelType = modelType;
		this.isStickGear = isStickGear;
	}
	
	public void printDetails() 
	{
		super.print();
		System.out.println("The model type is:" + modelType);
		System.out.println("The milage is: " + milage);
		System.out.println("The price of the car is: " + price);
		if(isStickGear)
		{
			System.out.println("The car has a stick gear. sad.");
		}
		else
		{
			System.out.println("The car has a automatic gear. yay!");
		}
	}
	
	
}
