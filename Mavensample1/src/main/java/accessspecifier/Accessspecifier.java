package accessspecifier;

public class Accessspecifier {
	public void pubdisplay()
	{
		System.out.println("Public method");
	}
	
	void defdisplay()
	{
		System.out.println("Default method");
	}
	
	private void privdisplay()
	{
		System.out.println("Private method");
	}
	
	protected void prodisplay()
	{
		System.out.println("Protected method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessspecifier obj=new Accessspecifier();
		obj.pubdisplay();
		obj.prodisplay();
		obj.defdisplay();
		obj.privdisplay();

	}

}
