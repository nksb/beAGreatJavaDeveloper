package main.chainOfResponsibility.judgeCharacterByColor;

public class Red extends Color {

	public Red (ColorEnum color) {
		super(color);
	}

	protected void showCharacter (ColorEnum color) {
		System.out.println("You selected Red.");
		System.out.println("Your character is below");
		System.out.println("#1.positive and very active");
		System.out.println("#2.your emotional ups and downs are erratic");
	}
}
