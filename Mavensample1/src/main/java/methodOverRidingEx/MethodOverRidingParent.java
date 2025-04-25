package methodOverRidingEx;

public class MethodOverRidingParent {
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println("Parent class sum will be: "+ c);
	}
	public void display()
	{
		System.out.println("Display");
	}

}
