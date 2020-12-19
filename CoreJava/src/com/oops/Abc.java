package com.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Abc {
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		MethodOverrdingTestMain m=new MethodOverrdingTestMain();
		   TreeSet t=new TreeSet(new ArchComparator());
		   t.add(3);
		   t.add(1);t.add(22);t.add(4);
		   System.out.println(t);
		   
        }

}
