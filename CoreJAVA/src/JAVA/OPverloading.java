package JAVA;

class addition
{
	int x,y;
	public void sum()
	{
		x=10;
		y=40;
		System.out.println("first sum is "+ (x+y));
	}
	public void sum(int a)
	{
		x=a;
		y=a;
		System.out.println("second sum is "+ (x+y));
	}
	public void sum(float b)
	{
		x=y=(int)b;
		System.out.println("first sum is "+ (x+y));
	}
}

public class OPverloading {
	
	public static void main(String[] args) {
		addition a1=new addition();
		
		
	}

}
