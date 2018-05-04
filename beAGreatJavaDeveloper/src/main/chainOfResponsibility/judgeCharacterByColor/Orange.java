package main.chainOfResponsibility.judgeCharacterByColor;

public class Orange extends Color {

	public Orange (ColorEnum color) {
		super(color);
	}

	protected void showCharacter (ColorEnum color) {
		System.out.println("You selected Orange.");
		System.out.println("Your character is below");
		System.out.println("#1.active");
		System.out.println("#2.like wide and shallow human relations");
	}
}
