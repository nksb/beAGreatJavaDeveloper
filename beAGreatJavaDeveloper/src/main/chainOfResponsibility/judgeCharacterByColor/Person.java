package main.chainOfResponsibility.judgeCharacterByColor;

public class Person {

	private String name;
	private ColorEnum color;

	public Person (String name, ColorEnum color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public ColorEnum getColor() {
		return color;
	}
}
