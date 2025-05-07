package accessspecifier;
//out side class access specifier
public class AccessspecifierOutsideClass extends Accessspecifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessspecifierOutsideClass obj1=new AccessspecifierOutsideClass();
		obj1.defdisplay();
		obj1.prodisplay();
		obj1.pubdisplay();
		//Here we can't access private access specifier, because it is private
		
	}

}
