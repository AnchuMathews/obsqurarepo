package inheritance;

public class HierarchiChild1 extends HierarchiParent{
	public void Child() {
		System.out.println("This is child1");
	}

	public static void main(String[] args) {
		HierarchiChild1 obj=new HierarchiChild1();
		obj.Child();
		obj.parent();
		// TODO Auto-generated method stub

	}

}
