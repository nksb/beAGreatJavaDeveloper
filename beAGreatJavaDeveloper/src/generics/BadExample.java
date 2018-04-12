package generics;

import java.util.ArrayList;

public class BadExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("string");
		String a = (String)list.get(0);
		System.out.println(a);
	}
}
