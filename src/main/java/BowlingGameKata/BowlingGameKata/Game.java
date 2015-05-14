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
			if(rolls[index] ==10){
				score += 10 + rolls[index +1] + rolls[index +2];
				index++;
			}
			else if(isSpare(index)){
				score += 10 + rolls[index+2];
				index +=2;
			}
			else{
				score += rolls[index] + rolls[index+1];
				index+=2;
			}
		}
		return score ;
	}

	private boolean isSpare(int index) {
		return rolls[index] + rolls[index +1] == 10;
	}
}
