package superkeyword;

public class AssSuperC extends AssSuperP {
	public void divi() 
	{
		super.sum();
		int a=108;
		int b=10;
		int c=a+b;
		if(c%10 == 0)
		{
			System.out.println("value divisible by 10");
		}
		else
		{
			System.out.println("Value not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssSuperC obj=new AssSuperC();
		obj.divi();;

	}

}
