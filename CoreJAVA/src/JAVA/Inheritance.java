package JAVA;

class Student 
{
	String sname,scity;
	
	public void setStudentdtData()
	{
	
		sname="akhil";
		scity="jnd";
				
	}	
}

class Sport extends Student
{
	String spname;
	
	public void SetSportData()
	{


	spname="volleyball";
	}
}

class result extends Sport
{
	String grade;
	public void SetresultData()
	{
		
		grade="a";
	}
	public void display()
	{
		System.out.println("Sname is .." + sname);
		System.out.println("city is .." + scity);
		System.out.println("Spname is .." + spname);
		System.out.println("grade is .." + sname);
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		
		result r1=new result ();
		r1.setStudentdtData();
		r1.SetSportData();
		r1.SetresultData();
		r1.display();
	}


}