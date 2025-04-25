package superkeyword;

public class SuperMethod2 extends SuperMethod1{
	public void display1() {
		System.out.println("Super class method2");
		super.display();//instead of calling from main method we can call from current class method
		//super.display3(1, 10);
		this.display4();
	}
	
	public void display4() {
		System.out.println("New Method");
		super.display3(1, 20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethod2 obj=new SuperMethod2();
		//obj.display();
		obj.display1();

	}

}
