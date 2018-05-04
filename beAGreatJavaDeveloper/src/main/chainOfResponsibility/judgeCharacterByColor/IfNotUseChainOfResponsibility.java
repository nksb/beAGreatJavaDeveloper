package main.chainOfResponsibility.judgeCharacterByColor;

import java.util.ArrayList;
import java.util.List;

public class IfNotUseChainOfResponsibility {

	public static void main(String[] args) {
		// if not use Chain of Responsibility pattern, like below
		List<Person> list = new ArrayList<Person>();
		setPerson(list);

		Color green = new Green(ColorEnum.GREEN);
		Color yellow = new Yellow(ColorEnum.YELLOW);
		Color pink = new Pink(ColorEnum.PINK);
		Color red = new Red(ColorEnum.RED);
		Color orange = new Orange(ColorEnum.ORANGE);
		Color black = new Black(ColorEnum.BLACK);

		/*
		 * if you add other color,
		 * you have to add it and test of if-else statement
		 */

		// in the case of using if-else statement
		for (Person person: list) {
			System.out.println("Hi " + person.getName() + "!");
			if (person.getColor().equalWithColor(ColorEnum.GREEN)) {
				System.out.println("You selected Green");

			} else if (person.getColor().equalWithColor(ColorEnum.YELLOW)) {
				System.out.println("You selected Yellow");

			} else if (person.getColor().equalWithColor(ColorEnum.PINK)) {
				System.out.println("You selected Pink");

			} else if (person.getColor().equalWithColor(ColorEnum.RED)) {
				System.out.println("You selected Red");

			} else if (person.getColor().equalWithColor(ColorEnum.ORANGE)) {
				System.out.println("You selected Orange");

			} else if (person.getColor().equalWithColor(ColorEnum.BLACK)) {
				System.out.println("You selected Black");
			} else {
				System.out.println("The color you selected is invalid");

			}
		}

		/*
		 * if you add other color,
		 * you have to add it and test of switch statement
		 */

		// in the case of using switch statement
//		for (Person person: list) {
//			System.out.println("Hi " + person.getName() + "!");
//
//			switch (person.getColor()) {
//			case GREEN:
//				System.out.println("You selected Green");
//				break;
//			case YELLOW:
//				System.out.println("You selected Yellow");
//				break;
//			case PINK:
//				System.out.println("You selected Pink");
//				break;
//			case RED:
//				System.out.println("You selected Red");
//				break;
//			case ORANGE:
//				System.out.println("You selected Orange");
//				break;
//			case BLACK:
//				System.out.println("You selected Black");
//				break;
//			default:
//				System.out.println("The color you selected is invalid");
//				break;
//			}
//		}
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
