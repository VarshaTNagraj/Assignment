
 class Hierarical_inheritance 
{
	public static void main(String[] args)
	{
		WhatsUp wp=new WhatsUp();
		System.out.println("------Login to whatsup------");
		System.out.println("Username="+wp.Name);
		System.out.println("Phone_Number="+wp.Phone_Number);
		wp.login();
		
		Chat ct=new Chat();
		System.out.println("------We can chat with others------");
		System.out.println("Message="+ct.msg);
		ct.Text();
		
		Status st=new Status();
		System.out.println("------We can upload images and videos------");
		System.out.println("Select images from="+st.image);
		st.upload();
	}

}
