package com.kodewala.week.one;

import java.util.HashMap;

public class Test1
{
	public static void main(String[] args)
	{
      HashMap<String, String> map = new HashMap<String, String>(16);
      
      map.put("Orange", "1");
      map.put("Orangedsa", "1");
      System.out.println(map);
      System.out.println("Total Bucket Size: " + map);
	}
}
