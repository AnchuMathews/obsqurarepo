package abstractExample;

public class AbstractChildref extends AbstractParent1ref{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractParent1ref obj=new  AbstractChildref();//reference created here(we can't create object for abstract class )
		obj.new1();
		//obj. By using object/reference of parent class we can't get child class property.
		AbstractChildref obj1=new AbstractChildref();
		obj1.new2();
		

	}
	public void new2() //here we can't create abstract method.
	{
		System.out.println("normal instance method inside child class");
	}

	@Override
	public void new1() {
		System.out.println("Abstract parent ");
		// TODO Auto-generated method stub
		
	}

}
