package exercise1;

public class Pen {
	int Cost=20;
	String brand="parker";
	String color="grey";
	void changecost(int newValue)
	{
		Cost=newValue;
	}
	void printState() {
		System.out.print("cost:" + Cost + "  brand:" + brand + "  color:" + color);
	}

	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.changecost(250);
		//System.out.println("cost of the pen is ="+Cost);
		p1.printState();

	}

}
