package methodOverRidingEx;

public class MethodOverRidingChildEx extends MethodOverRidingParent {
	public void display(int a,int b)
	{
		super.display(1, 2);
		int c=a*b;
		System.out.println("Parent class product will be: "+ c);
	}

	//Short cut: Right click program code and then click source> override/implement method>tick and okay after that call the method by obj
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("overriding example");
	}

	public static void main(String[] args) {
		MethodOverRidingChildEx obj=new MethodOverRidingChildEx();
		obj.display(1,10);
		obj.display(); //overrided method calling here by obj
		
		
		
		// TODO Auto-generated method stub

	}

}
