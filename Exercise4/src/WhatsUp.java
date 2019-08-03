
public class WhatsUp
{
	String Name="Varsha";
	int Phone_Number=990088002;
	void login()
	{		
		System.out.println("WelCome to Whatsup");
	}
}
	class Chat extends WhatsUp
	{
		String msg="Hai, How are you";
		void Text()
		{
	     System.out.println("Message send");		
		}
	}
	class Status extends WhatsUp
	{
		String image="Gallery";
		void upload()
		{
			System.out.println("Status uploaded ");
		}
	}

	


