public class Car 
{
	String color;
	int year;

	
	public Car()
	{
		this.color = "blue";
		this.year = 2018;

	}
	
	public Car(String color, int year)
	{
		this.color = color;
		this.year = year;
		
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getYear()
	{
		return year; 
	}
	
	public void print()
	{
	  System.out.println("The car details are:");
	  System.out.println("The coler of the car is: " + color);
	  System.out.println("The car was made in:" + year);
	}
}
