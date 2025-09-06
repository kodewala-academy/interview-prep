package com.kodewala.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo
{

	public static void main(String[] args)
	{
		List<List<Integer>> inputList = Arrays.asList(Arrays.asList(2, 7, 3, 6), Arrays.asList(1, 5, 4, 3, 5, 7));

		System.out.println(inputList);

		Stream<List<Integer>> stream = inputList.stream();

		// filter the element whose length is 3 . filter is intermediate
		// operation(lazy), it
		// will return another stream

		Stream<Integer> filteredStream = stream.flatMap(list -> list.stream()).filter(n -> n % 2 == 0);

		// Collect the result. This is terminal operation.

		List<Integer> outputList = filteredStream.collect(Collectors.toList());

		System.out.println(outputList);

	}

}
