package com.javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class javaStreams {


	// Count the number of names starting with Alphabet A in list

	@Test
	public void regular() {

		ArrayList<String> names= new ArrayList<>();
		names.add("Arun");
		names.add("varun");
		names.add("Amul");
		names.add("Adam");
		names.add("Ram");

		int count=0;

		for (int i = 0; i < names.size(); i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A")) 
			{
				count++;
			}

		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<>();

		names.add("Arun");
		names.add("Varun");
		names.add("Amul");
		names.add("Adam");
		names.add("Ram");

		long cc=  names.stream().filter(s->s.startsWith("R")).count();
		System.out.println(cc);

		//1.print all the names of ArrayList


		names.stream().forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>2).forEach(s->System.out.println("Name of charcter > 2 :"+s));
		names.stream().filter(s->s.length()>2).limit(1).forEach(s->System.out.println("Limit :"+s));


	}
	@Test
	public void stream() {

		long c=	Stream.of("Arun","Don","Virat","Kohil","Amul").filter(s->s.startsWith("V")).count();

		System.out.println(c);

	}
	@Test
	public void streamMap() {

		// print names which have letter as "a " with Uppercase
		
		Stream.of("Arun","Don","Virat","Kohil","Amul").filter(s->s.endsWith("l")).forEach(s->System.out.println(s));
		Stream.of("Arun","Don","Virat","Kohil","Amul").filter(s->s.endsWith("l")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream.of("Arun","Don","Virat","Kohil","Amul").map(s->s.toUpperCase()).forEach(s->System.out.println("name :"+s));



	}
	@Test
	public void streamMaps() {


		// print names which have first letter as a a with uppercase and sorted
		// terminal operation - count, limit ,sorted

		String  arr[]=new String[]{"Arun","Don","Virat","Kohil","Amul"};
		Integer arr2[]= new Integer[] {15,25,3,4,5};

		List<String> names=	Arrays.asList(arr);
		//	List<String> names=	Arrays.asList("Arun","Don","Virat","Kohil","Amul");
		List<Integer> num=	Arrays.asList(arr2);
		//	List<Integer> num=	Arrays.asList(15,25,3,4,5);

		//	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		num.stream().forEach(s->System.out.println(s));
		num.stream().sorted().forEach(s->System.out.println(s));
	}
	@Test

	public void sorted() {

		// Merging 2 different lists
		List<String> names=  	Arrays.asList("Runking","Sehwag","Viru","Avun","Varun");
        List<String> names1=	Arrays.asList("Arun","Don","Virat","Kohil","Amul");

		Stream<String> newStream=	Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));

		/*boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("kohil"));
	     System.out.println(flag);
	      Assert.assertTrue(flag);*/
	}
	@Test
	public void streamCollect() {
	List<String> lss=	Stream.of("Arun","Don","Virat","Kohil","Amul").filter(s->s.endsWith("l")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
	lss.stream().forEach(s->System.out.println(s));
	System.out.println(lss.get(1));
	}
	
	@Test
	public void intStream() {
		
	// print unique number from this array
    // sort the array
		
		Integer arr[]= new Integer[] {3,2,2,1,2,5,6,7,8,5};
		
		List<Integer>  num=  Arrays.asList(arr);
		
		num.stream().sorted().forEach(s->System.out.println(s));
		num.stream().sorted().distinct().forEach(s->System.out.println("unique"+s));
	    List<Integer> value=	num.stream().distinct().sorted().collect(Collectors.toList());
	    value.stream().forEach(s->System.out.println("j: "+s));
	    System.out.println("third value: "+value.get(3));
		
		
	
		
	}

}
