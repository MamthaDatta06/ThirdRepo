package com.mamtha;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Stringtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
		   
           copyOnWriteArrayList.add("ind");
           copyOnWriteArrayList.add("usa");
           copyOnWriteArrayList.add(null);
 
           for (String string : copyOnWriteArrayList) {
                  System.out.println(string+" ");
                  copyOnWriteArrayList.add("newEle3");
           }
           System.out.print(copyOnWriteArrayList);
           
	}}


