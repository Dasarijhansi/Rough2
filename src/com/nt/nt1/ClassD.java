package com.nt.nt1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ClassD {

	int meth2(int x, int y)
	{
		int a=x+y;
		return a;
	}
	
	void meth1()
	{
       System.out.println("hi");
       int c=this.meth2(3, 4);
       System.out.println(c);
       
	}
	public static void main(String[] args) {
		
		ClassD dobj=new ClassD();
		dobj.meth1();
		System.out.println("bye");
		
	}
}
