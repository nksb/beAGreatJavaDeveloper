package main.chainOfResponsibility.judgeCharacterByColor;

public abstract class Color {

	private Color next;
	private ColorEnum color;

	public Color(ColorEnum color) {
		this.color = color;
	}

	public Color setNext(Color next) {
		this.next = next;
		return next;
	}

	public void selectColor (ColorEnum color) {
		if (beAbleToJudge(color)) {
			showCharacter(color);
		} else if (next != null) {
			next.selectColor(color);
		} else {
			System.out.println("The color you selected is invalid. Please select other color!");
		}
	}

	protected boolean beAbleToJudge (ColorEnum color) {
		if (this.color.equalWithColor(color)) {
			return true;
		} else {
			return false;
		}
	}

	protected abstract void showCharacter (ColorEnum color);
}
