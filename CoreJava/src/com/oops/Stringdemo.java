package com.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1,"anagha");
		hm.put(2,"aim");
		hm.put(3,"gayatri");
		hm.put(4,"tripura");
		System.out.println(hm);
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"................"+m.getValue());
		}
	}
	
	

}
