//multilevel inheritance with child class created here 
package inheritance;

public class MultiChild extends MultiIntermediate{
	public void child()
	{
		System.out.println("This is the child class");
	}

	public static void main(String[] args) {
		MultiChild obj=new MultiChild();//here we call all methods by creating object from child class
		obj.child();
		obj.parent();
		obj.intermediate();
		
		/*MultiIntermediate obj=new MultiIntermediate();
		obj.intermediate();
		obj.parent();
	*/
		// TODO Auto-generated method stub

	}

}
