package encapsulationpackage;

public class EncapsChild1 { //encapsulation example

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsParent1 obj=new EncapsParent1();
		obj.setPassword(123344);
		System.out.println(obj.getPassword());
		obj.setUsername("Anchu");
		System.out.println(obj.getUsername());
	}

}
