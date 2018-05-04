package main.chainOfResponsibility.judgeCharacterByColor;

public class Green extends Color {

	public Green (ColorEnum color) {
		super(color);
	}

	protected void showCharacter (ColorEnum color) {
		System.out.println("You selected Green.");
		System.out.println("Your character is below");
		System.out.println("#1.conservative");
		System.out.println("#2.judicious and delicate");
		System.out.println("#3.talkative");
	}
}
