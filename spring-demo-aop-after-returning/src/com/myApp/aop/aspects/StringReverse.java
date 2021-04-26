package com.myApp.aop.aspects;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class StringReverse {

	public static String longestSequence(String str) {
		String longestSeq = "";
		Comparator<String> c = (i,i1)->{
			int iSize = i.length();
			int i1Size = i1.length();
			return (iSize < i1Size) ? 1 :(iSize > i1Size)?-1:0;
		};
		
		Set<String> longestSet = new TreeSet<String>(c);
		Set<Character> tempSet = new HashSet<Character>();
		for (int i = 0; i <str.length(); i++) {
			if(tempSet.add(str.charAt(i))) {
				longestSeq += str.charAt(i);
			}else {
				if(longestSeq != "")
					longestSet.add(longestSeq);
				longestSeq = "";
			}
		}
		String first = longestSet.stream().findFirst().get();
		return first;
	}

	public static void main(String[] args) {
		String input = "xyxyabcxdefffxyze";
		System.out.println("Longest String : "+ longestSequence(input));
	}

}
