package com.aurionpro.model;

public class BufferTest {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("World"); 
		System.out.println(sb);
		sb.insert(1, "San");
		System.out.println(sb);
		sb.replace(1,3,"Sam");
		System.out.println(sb);
		sb.delete(1,3);  
		System.out.println(sb);
		sb.reverse();  
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
