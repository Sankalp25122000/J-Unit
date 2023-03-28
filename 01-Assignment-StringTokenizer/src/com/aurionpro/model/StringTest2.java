package com.aurionpro.model;

import java.util.StringTokenizer;

public class StringTest2 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello Everyone","");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

	}

}
