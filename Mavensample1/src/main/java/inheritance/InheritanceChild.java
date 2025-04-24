//Single Inheritance example , Child class created here
package inheritance;

public class InheritanceChild extends InheritanceParent {
	public void childdisplay()
	{
		System.out.println("This is the child class");
	}

	public static void main(String[] args) {
		InheritanceChild obj=new InheritanceChild(); //for getting properties of both parent and child use child class 
		obj.childdisplay();
		obj.parent();
		// TODO Auto-generated method stub
		//InheritanceParent obj=new InheritanceParent();
		//obj.parent();

	}

}
