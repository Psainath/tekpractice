
public class OverRaiding {
	
	public void Classroom()
	{
		System.out.println("this is Java Class");
	}
	
	public void Classroom(String Classes)
	{
	
    	   System.out.println("this is"+ Classes + "class");
      	
	}
	
	public static void main (String args[])
	{
		OverRaiding Const = new OverRaiding();
		Const.Classroom();
		Const.Classroom("hello");
		
	}
}
