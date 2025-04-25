package inheritance;

public class HierarchiChild2 extends HierarchiParent {
	public void Child2() {
		System.out.println("This is child2");
	}

	public static void main(String[] args) {
		HierarchiChild2 obj=new HierarchiChild2();
		obj.Child2();
		obj.parent();
		// TODO Auto-generated method stub

	}

}
