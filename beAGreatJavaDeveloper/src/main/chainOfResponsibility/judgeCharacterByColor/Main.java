package main.chainOfResponsibility.judgeCharacterByColor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		setPerson(list);

		Color green = new Green(ColorEnum.GREEN);
		Color yellow = new Yellow(ColorEnum.YELLOW);
		Color pink = new Pink(ColorEnum.PINK);
		Color red = new Red(ColorEnum.RED);
		Color orange = new Orange(ColorEnum.ORANGE);
		Color black = new Black(ColorEnum.BLACK);
		green.setNext(yellow).setNext(pink).setNext(red).setNext(orange).setNext(black);

		for (Person person: list) {
			System.out.println("Hi " + person.getName() + "!");
			green.selectColor(person.getColor());
		}
	}

	// each person select their favorite color
	public static void setPerson(List<Person> list) {
		list.add(new Person("satoshi", ColorEnum.ORANGE));
		list.add(new Person("miwa", ColorEnum.RED));
		list.add(new Person("taro", ColorEnum.GREEN));
		list.add(new Person("hitoshi", ColorEnum.YELLOW));
		list.add(new Person("eri", ColorEnum.BLACK));
		list.add(new Person("richard", ColorEnum.BROWN));
		list.add(new Person("rio", ColorEnum.PINK));
	}
}