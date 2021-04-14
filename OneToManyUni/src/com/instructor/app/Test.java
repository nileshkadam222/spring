package com.instructor.app;


class OverloadMethodExample{
	public OverloadMethodExample(String s) {
		System.out.println(s);
	}
	
	public OverloadMethodExample(StringBuffer s) {
		System.out.println(s);
	}
	
	public OverloadMethodExample(StringBuilder s) {
		System.out.println(s);
	}
}
public class Test {

	public static void main(String[] args) {
		OverloadMethodExample o = new OverloadMethodExample((String)null);
	}

}
