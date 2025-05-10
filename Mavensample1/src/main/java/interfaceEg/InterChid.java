package interfaceEg;

public class InterChid implements InterParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterChid obj=new InterChid();
		obj.display();
		System.out.println(obj.i);
		System.out.println(obj.add(10, 10));
		InterParent obj2=new InterChid();
		obj2.display(); //child class property doesn't access here "obj2.add" not visible
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method override");
		
	}
	
	public int add(int b, int c)
	{
		int sum=b+c;
		return sum;
	}

}
