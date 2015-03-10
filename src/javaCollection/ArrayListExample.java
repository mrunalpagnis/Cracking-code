
package javaCollection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first method to initialize
		ArrayList<String> fun = new ArrayList<String>();
		fun.add("Mrunal");
		fun.add("Lakshmi");
		fun.add("Namrata");
		fun.add("Isha");
		fun.add("Vishaka");
		
		//second method to initialize
		ArrayList<Integer> fun1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		//third method to initialize
		ArrayList<String> fun2 = new ArrayList<String>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{add("A");add("B");}};
		
		System.out.println("fun elements: "+fun);
		
		System.out.println("fun1 elements: "+fun1);
		
		System.out.println("fun2 elements: "+fun2);
		
		fun.remove(3);
		
		System.out.println("fun elements: "+fun);
		
		System.out.println("count : " + fun.size());
		
		System.out.println("element at 3: "+fun.get(3));
		
		//advanced for loop
		for(String s: fun)
		{
			System.out.println(s);
		}
		
		//enumeration example
		Enumeration<String> e= Collections.enumeration(fun);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//add all
		fun.addAll(fun2);
		System.out.println("fun elements: "+fun);
		
		//synchronize arraylist
		List<String> sync = Collections.synchronizedList(fun);
		System.out.println("sync list : "+sync);
		
		//copyonwrite
		CopyOnWriteArrayList<String> c= new CopyOnWriteArrayList<String>();
		c.add("concurrent");
		System.out.println("copy on write list : "+c);
		
		
	}
}
