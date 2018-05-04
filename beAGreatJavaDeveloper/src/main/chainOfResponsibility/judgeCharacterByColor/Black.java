package main.chainOfResponsibility.judgeCharacterByColor;

public class Black extends Color{

	public Black (ColorEnum color) {
		super(color);
	}

	protected void showCharacter (ColorEnum color) {
		System.out.println("You selected Black.");
		System.out.println("Your character is below");
		System.out.println("#1.sensitive");
		System.out.println("#2.tend not to like to follow someone");
	}
}
