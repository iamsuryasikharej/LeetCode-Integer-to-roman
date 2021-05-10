package com.leetcode;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


import java.io.*;
public class Test {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("enter a num");
		String str = br.readLine();
		int number=Integer.parseInt(str);
		if(number==0 || number >= 4000)
		{
			System.out.println("not possible");
			System.exit(0);
		}
		Map<Integer,String> hm=new TreeMap<>(Collections.reverseOrder()) ;
			
		hm.put(1,"I");
		hm.put(4,"IV");
		hm.put(5,"V");
		hm.put(9, "IX");
		hm.put(10, "X");
		hm.put(40,"XL");
		hm.put(50,"L");
		hm.put(90,"XC");
		hm.put(100,"CD");
		hm.put(400,"C");
		hm.put(500,"D");
		hm.put(900,"CM");
		hm.put(1000,"M");
		StringBuffer b=new StringBuffer();
		for(Map.Entry<Integer, String> s : hm.entrySet())
		{
			int y=s.getKey();
			int c=0;
			while(number/y!=0)
			{
				 c=number/y;
				number  = number%y;
				
			}
			for(int i=0;i<c;i++)
			{
				b.append(s.getValue());
			}
			
			
		}
		System.out.println("The roman equivalent of the integer is"+b);
		}

}
