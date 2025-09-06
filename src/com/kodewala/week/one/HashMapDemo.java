package com.kodewala.week.one;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{

	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("1India", "new delhi"); // 12345 3rd bucket
		map.put("1UK", "landon");
		map.put("Ne11pal", "kathmandu");
		map.put("China1", "bejing"); // 12345 3rd bucket
		map.put("China2", "bejing");
		
		map.put("China22", "bejing");
		map.put("China23", "bejing");
		map.put("China25", "bejing");
		map.put("China26", "bejing");
		map.put("China27", "bejing");
		map.put("China29", "bejing");
		map.put("China30", "bejing");
		
		System.out.println(" adding more element");
		
		map.put("China33", "bejing");
		System.out.println("India".hashCode());
	}

}
