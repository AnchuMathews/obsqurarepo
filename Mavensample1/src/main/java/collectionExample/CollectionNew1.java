package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class CollectionNew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Adding elements to a list/collection - "add" method
		
		List<String> li=new ArrayList<String>();
		li.add("Apple");
		li.add("Banana");
		li.add("Grapes");
		li.add("Orange");
		li.add("Mango");
		System.out.println(li);
		
		//"set" method - insert a new element to a particular index
		
		li.set(1, "Orange");
		System.out.println(li);
		
		//"index() method - finding the index of particular element
		
		System.out.println(li.indexOf("Apple"));
		System.out.println(li.indexOf("Orange")); //repeated element will show the 1st occurrence
		
		//"lastindex()"  method -finding the index of last element
		
		System.out.println(li.lastIndexOf("Orange")); //repeated element will show the last occurrence in "lastindex" method
		
		//"Get" method - for getting an element from the list
		
		System.out.println(li.get(3));
		
		//"contains" method - Check whether an element is present or not , it will return boolean
		
		System.out.println(li.contains("Apple"));
		
		//"isempty" method - used to check whether list is empty or not
		
		System.out.println(li.isEmpty()); //Boolean values will be returned
		
		//Using if condition we can check "isempty" method
		
		if(li.isEmpty())
		{
			System.out.println("List is empty");
		
		}
		else
		{
			System.out.println("List is not empty");
		}
		
		//"size" method - for getting the size or length of a list/collection
		
		System.out.println(li.size());
		
		//"for loop" used for iteration in list
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println("Iteration result : ");
			System.out.println(li.get(i));
		}
		
		
		//"for each " loop used iteration
		System.out.println("");
		System.out.println("for each loop used  result : ");
		for(String b:li)
		{
			
			System.out.println(b);
		}
	}

}
