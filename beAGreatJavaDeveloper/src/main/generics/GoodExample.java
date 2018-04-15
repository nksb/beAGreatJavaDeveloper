package main.generics;

import java.util.ArrayList;

public class GoodExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
//		list.add(1);
		list.add("string");
		String a = (String)list.get(0);
		System.out.println(a);
	}
}