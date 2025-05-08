package abstractExample;

public class AbstractChild extends AbstractParent{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.display();
		System.out.println(obj.display1());
		obj.display3();//instance method calling
		obj.display4();

	}

	@Override
	public void display() {
		System.out.println("Display child");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int display1() {
		// TODO Auto-generated method stub
		int a=10;
		int b=1;
		int c=a+b;
		return c;
	}
	public void display4()
	{
		System.out.println("instance method in child class");
	}

}
