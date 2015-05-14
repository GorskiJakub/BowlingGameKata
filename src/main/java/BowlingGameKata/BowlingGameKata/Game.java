package BowlingGameKata.BowlingGameKata;

public class Game {

	private int score = 0;

	public void roll(int i) {
		score += i;
	}

	public Object score() {
		return score ;
	}
}
