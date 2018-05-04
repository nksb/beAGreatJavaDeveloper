package main.chainOfResponsibility.judgeCharacterByColor;

public class Yellow extends Color {

	public Yellow (ColorEnum color) {
		super(color);
	}

	protected void showCharacter (ColorEnum color) {
		System.out.println("You selected Yellow.");
		System.out.println("Your character is below");
		System.out.println("#1.curious and a strong upward mobility");
		System.out.println("#2.thinking that hierarchical relationship is important");
		System.out.println("#3.getting bored easily");
	}
}
