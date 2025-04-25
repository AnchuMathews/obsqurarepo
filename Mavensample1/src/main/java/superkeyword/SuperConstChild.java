package superkeyword;

public class SuperConstChild extends SuperConstParent {
	public SuperConstChild(int a, int b)
	{
		super(12,2);
		int c=a+b;
		System.out.println("child class sum will be: "+c);
	}

	public SuperConstChild(int c)
	{
		super();//Either we can call default constructor or we can create obj in main method and invoke constructor
		System.out.println(c);
	}
	public static void main(String[] args) {
		SuperConstChild obj=new SuperConstChild(10,2);
		SuperConstChild obj1=new SuperConstChild(10);
		SuperConstParent obj2=new SuperConstParent(); //calling parent constructor by creating object
		
		// TODO Auto-generated method stub

	}

}
