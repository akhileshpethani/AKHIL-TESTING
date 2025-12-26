package JAVA;
class parents
{
	String pname;
	public void setparentsdata()
	{
		pname="sanjaybhai";
	}
}

class child1 extends parents
{
	String cname;
	public void setchild1data()
	{
		cname="akhil";
		
	}
	public void display()
	{
		System.out.println(cname + " " + pname );
	}
}

class child2 extends child1
{
	String cname;
	public void setchild2data()
	{
		cname="manan";
		
	}
	public void display()
	{
		System.out.println(cname + " " + pname );
	}
}
public class hierachical {
	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.setchild1data();
		c1.setparentsdata();
		c1.display();
		
		child2 c2 = new child2();
		c2.setchild2data();
		c2.setparentsdata();
		c2.display();
		
	}
}
