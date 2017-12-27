
public class ConstOverLoading {

	public void Student(int age)
	{
		System.out.println("the Age is : " + age);
	}
	public void student (String name)
	{
		
		System.out.println("the name is :" + name);
				
	}
	

public static void main(String args[])
{
	ConstOverLoading Constover = new ConstOverLoading();
	Constover.Student(25);
	Constover.student("lovely");
	
}

}
