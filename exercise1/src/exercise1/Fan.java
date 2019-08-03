package exercise1;

public class Fan {
	int Cost=2000;
	int Wings=3;
	String Color="white";
	int Speed=3;
	void changeSpeed(int newValue)
	{
		Speed=newValue;
	}
	void printStates()
	{
		System.out.println(" Cost="+Cost+" Wings="+Wings+" Color="+Color+" Speed="+Speed);
	}

	public static void main(String[] args) {
		Fan F1=new Fan();
		F1.changeSpeed(5);
		F1.printStates();

	}

}
