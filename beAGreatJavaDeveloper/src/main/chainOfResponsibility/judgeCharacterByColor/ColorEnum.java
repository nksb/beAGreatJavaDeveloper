package main.chainOfResponsibility.judgeCharacterByColor;

public enum ColorEnum {

	GREEN
	, YELLOW
	, PINK
	, RED
	, ORANGE
	, BLACK
	, BROWN
	, GREY
	, BLUE
	, WHITE
	, PURPLE;

	public boolean equalWithColor (ColorEnum color) {
		if (this.equals(color)) {
			return true;
		} else {
			return false;
		}
	}
}
