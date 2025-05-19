package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<String>();
		
		arr.add("Apple");
		arr.add("Banana");
		arr.add("Grapes");
		arr.add("Orange");
		arr.add("Mango");
		System.out.println(arr);
		
		//new list
		ArrayList<String>ar=new ArrayList<String>();
		
		ar.add("Apple1");
		ar.add("Banana1");
		ar.add("Grapes1");
		ar.add("Orange1");
		ar.add("Mango1");
		System.out.println(ar);
		
		//"addAll" method used to combine two lists
		
		System.out.println(arr.addAll(ar)); //boolean result will present
		System.out.println(arr);
		
		
		//"containsAll" method used to check whether a particular list present or not
		
		System.out.println(arr.containsAll(ar));
		
		//Remove
		System.out.println(arr.remove(0));
		
		System.out.println(arr); //"apple" removed from the list
		
		//iterator
		
		
		System.out.println("iterator working : ");
		
		Iterator<String>itr=arr.iterator();
		
		while(itr.hasNext());
		{
			
			System.out.println(itr.next());
		}
		//itr.remove();
		
		
		
	}

}
