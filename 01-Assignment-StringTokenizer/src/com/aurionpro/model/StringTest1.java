package com.aurionpro.model;

import java.util.StringTokenizer;

public class StringTest1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello,Sankalp");
        
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
