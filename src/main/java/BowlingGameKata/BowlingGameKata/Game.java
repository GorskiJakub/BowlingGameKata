package BowlingGameKata.BowlingGameKata;

public class Game {

	private int[] rolls = new int[21];
	private int currentRoll =0;

	public void roll(int i) {
		rolls[currentRoll++] = i;
	}

	public int score() {
		int score =0;
		int index = 0;
		
		for(int temp =0; temp <10; temp++){
			if(isStrike(index)){
				score += 10 + strikeBonus(index);
				index++;
			}
			else if(isSpare(index)){
				score += 10 + spareBonus(index);
				index +=2;
			}
			else{
				score += sumOfBallsInFrame(index);
				index+=2;
			}
		}
		return score ;
	}

	private int spareBonus(int index) {
		return rolls[index + 2];
	}

	private int sumOfBallsInFrame(int index) {
		return rolls[index] + rolls[index + 1];
	}

	private int strikeBonus(int index) {
		return rolls[index + 1] + rolls[index + 2];
	}

	private boolean isStrike(int index) {
		return rolls[index] == 10;
	}

	private boolean isSpare(int index) {
		return rolls[index] + rolls[index +1] == 10;
	}
}
