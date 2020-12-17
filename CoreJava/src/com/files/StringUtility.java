package com.files;

public class StringUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c='a';
CharSequence  s="mam tha";

for(int i=0;i<=s.length()-1;i++)
{
	if(Character.isWhitespace(s.charAt(i)))
	{
		System.out.println("whitespaces are there...");
		
	}
}

	}

}
