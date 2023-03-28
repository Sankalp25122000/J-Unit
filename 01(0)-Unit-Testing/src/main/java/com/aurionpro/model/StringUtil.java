package com.aurionpro.model;

public class StringUtil {

	public String truncateAInFirst2Position(String str) {
		if(str.length()<=2 && str!= null) {
			str.replace("A","");
		}
		else {
			String str1 = str.substring(0,2).replace("A", "");
			String str2 = str.substring(2);
			str = str1+str2;
		}
		return str;

	}

	public String areFirstAndLastTwoCharactersTheSame(String str) {
		if(str.charAt(0) == str.charAt(str.length()-2) && str.charAt(1) == str.charAt(str.length()-1)) {
			return "true";
		}
		return "false";
		
		

	}
}

