package collectionExample;

import java.util.HashSet;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st=new HashSet<String>();
		st.add("Apple");
		st.add("Banana");
		st.add("orange");
		st.add("pumkin");
		st.add("Brinjal");
		
		System.out.println(st);//Set is not index based, there is no particular order, so index methods can't be implemented
		
		//remove an element without using index
		st.remove("orange");
		System.out.println(st); //"orange" removed from the set
		st.add("New orange");
		
		System.out.println(st); 
		
		st.add("New orange");
		System.out.println(st);//Duplicate elements cannot be added in set
		
		Set<String> stt=new HashSet<String>();
		stt.add("11");
		stt.add("12");
		stt.add("13");
		System.out.println(stt);
		
		//Add one set to another set
		
		st.addAll(stt);
		System.out.println(st);
		
		//"contains" method to check an element present or not
		
		System.out.println(st.contains("12"));
		
		//"containsAll" method used to check a set is present in another set or not
		
		System.out.println(st.containsAll(stt));
		
		System.out.println(st.size()); //for checking the size of a set
		
		System.out.println(st.isEmpty());//for checking whether set is empty or not
		
		st.clear();
		System.out.println(st); //clear the entire set
		
		

	}

}
