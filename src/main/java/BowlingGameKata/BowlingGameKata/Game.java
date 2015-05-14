package BowlingGameKata.BowlingGameKata;

public class Game {

	private int[] rolls = new int[21];
	private int currentRoll =0;

	public void roll(int i) {
		rolls[currentRoll++] = i;
	}

	public Object score() {
		int score =0;
		int i = 0;
		
		for(int temp =0; temp <10; temp++){
			if(rolls[i] + rolls[i+1] == 10){
				score += 10 + rolls[i+2];
				i +=2;
			}
			else{
				score += rolls[i] + rolls[i+1];
				i+=2;
			}
		}
		return score ;
	}
}
