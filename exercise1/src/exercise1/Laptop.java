package exercise1;

public class Laptop {
	int Cost=45000;
	String Brand="Lenova";
	String Color="Black";
	void changeBrand(String newValue)
	{
		Brand=newValue;
	}
	void printStates() 
	{
	System.out.println("Cost="  + Cost  + "  Brand=" + Brand + "  Color=" + Color );	
	}
	public static void main(String[] args) {
		Laptop L1=new Laptop();
		L1.changeBrand("Samsung");
		L1.printStates();
		}

}
