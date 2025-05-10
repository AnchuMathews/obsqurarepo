package interfaceEg;

public class InterC implements InterA,InterB { //interface use "implements"

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("InterB display");
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("InterA display");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterC obj=new InterC();
		obj.display1();
		obj.display2();
//multiple inheritance using interface  - one parent and 2 child
	}

}
