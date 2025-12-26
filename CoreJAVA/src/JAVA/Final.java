package JAVA;

class demo
{
	int no=100;
	String name;
	public final void setdata()
	{
		
		no=123;
		name="akhil";
		
	}
	public void show()
	{
		System.out.println("no is .."+no);
		System.out.println("name is .."+name);
	}
	
}
public class Final {
	public static void main(String[] args) {
		demo f1 = new demo();
		f1.setdata();
		f1.show();
	}
	
}
