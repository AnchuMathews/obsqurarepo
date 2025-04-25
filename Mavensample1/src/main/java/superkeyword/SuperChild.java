//Usage of super keyword - in both parent class and child class variable name is "color"

package superkeyword;

public class SuperChild extends SuperParent{
	String color="Green";
	public void display()
	{
		System.out.println(super.color);
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj=new SuperChild();
		System.out.println(obj.color);//first load result of this line
		obj.display(); //Then load result of this line

	}

}
