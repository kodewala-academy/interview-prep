package com.kodewala.week.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Person1  implements Comparable {

	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	// 
	
	
}

public class ListDemo
{

	public static void main(String[] args)
	{

		// modCount(size of the collection) vs expectedModCount
		
		List<String> list = new ArrayList<String>();
		
		list.add("Test0");
		list.add("Test1");
		list.add("Test2");
		
		
		Iterator<String> itr =list.iterator();
		
		while(itr.hasNext())
		{
			
			itr.next();
			list.add("testing");
			
		}
		
		
		
		
		
		
		
		
		
		Set<String> set = new TreeSet<String>(); // Treemap (Balanced Tree) to store the data.

		set.add("Hi");
		set.add("Hello");
		

		System.out.println(set);

		/*
		 * List<String> list = new ArrayList<String>(10);
		 * 
		 * // Ordered and Allow Duplicate
		 * 
		 * list.add("Kodewala"); list.add("Bangalore"); list.add("India");
		 * list.add("Academy"); list.add("Academy");
		 * 
		 * System.out.println(" List "+list);
		 * 
		 * 
		 * list.add(3, "BTM");
		 * 
		 * System.out.println(" List "+list);
		 */

	}

}
