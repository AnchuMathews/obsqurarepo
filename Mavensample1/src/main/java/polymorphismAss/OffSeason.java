package polymorphismAss;

public class OffSeason extends OnSeason {
	

	@Override
	public void discount(float amount) {  //method overriding
		// TODO Auto-generated method stub
		super.discount(1000);
		
		//float amount=1000;
		float discountPercet =15;
		float finalPrice = amount*(discountPercet/100);
		System.out.println("Final price of cloth in offseason: "+finalPrice);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnSeason obj=new OffSeason();
		obj.discount(1000);
		//OnSeason obj1=new OnSeason();
		//obj1.discount();

	}

}
