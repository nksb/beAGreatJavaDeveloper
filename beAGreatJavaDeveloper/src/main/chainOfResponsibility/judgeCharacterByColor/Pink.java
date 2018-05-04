package main.chainOfResponsibility.judgeCharacterByColor;

public class Pink extends Color {

	public Pink (ColorEnum color) {
		super(color);
	}

	protected void showCharacter (ColorEnum color) {
		System.out.println("You selected Pink.");
		System.out.println("Your character is below");
		System.out.println("#1.gentle and stable");
		System.out.println("#2.strong dependence");
	}
}
