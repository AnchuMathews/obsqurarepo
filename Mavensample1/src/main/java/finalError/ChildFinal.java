package finalError;

public class ChildFinal extends ParentFinal{
	public void display()//shows error - cannot override final keyword using methods
	{
		System.out.println("Parent class final keyword");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
