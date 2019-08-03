
public class Car {
	String Brand="Swift";
	int Cost=200000;
	String Color="red";
	void changeColor(String newValue)
	{
		Color=newValue;
	}
	void printStates()
	{
		System.out.println("Brand="+Brand+" Cost="+Cost+" Color="+Color);
	}

	public static void main(String[] args) {
		Car Car1=new Car();
		Car Car2=new Car();
		Car1.changeColor("Blue");
		Car1.printStates();
		
		Car2.changeColor("White");
		Car2.printStates();
	}

	

}
