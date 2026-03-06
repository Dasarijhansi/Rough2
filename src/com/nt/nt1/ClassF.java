package com.nt.nt1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassF {

	public static void main(String[] args) 
	{ 
		
	 List<Integer> list=Arrays.asList(1,3,21,101,14,2,6);
	 List<Integer> list1=Arrays.asList(23,96,28,5,87);
	
	List<String> li=Arrays.asList("jsgaf","ngzdfz","akhd","dfjhdgr","rfjv","lefds");
	String s="i am jhansi dsgd sgthsdsgg drs";
	String str[]=s.split(" ");
	
	String ss="jhajh";
	
	list.stream().filter(da->da%10==1).collect(Collectors.toList()).forEach(System.out::println);
	
	}
	
}
