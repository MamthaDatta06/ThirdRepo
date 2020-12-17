package com.mamtha;

import java.util.HashMap;
import java.util.TreeMap;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s="sriramadatta";
HashMap<Character,Integer> hm=new HashMap();
char c[]=s.toCharArray();
for(char c1:c)
{
	if(hm.containsKey(c1))
	{
		hm.put(c1,hm.get(c1)+1);
	}
	else
	{
		hm.put(c1,1);
	}
}
TreeMap tm=new TreeMap<>(hm);
System.out.println(tm);
}}
