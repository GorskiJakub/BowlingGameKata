package BowlingGameKata.BowlingGameKata;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.Before;

public class BowlingGameTest {

	
	private Game game;
	@Before
	public void StartUp(){
		game = new Game();
	}
	
	private void rollMany(int n, int pins){
		for(int i=0; i<n; i++)
			game.roll(pins);
	}
	
	@Test
	public void testGutterGame() {
		rollMany(20, 0);
		assertEquals(0, game.score());
	}
	@Test
	public void gameWithoutTwentyPoints(){
		rollMany(20,1);
		assertEquals(20, game.score());
	}
	@Test
	public void testOneSpare_returnScoreSixteen(){
		rollSpare();
		game.roll(3);
		rollMany(17,0);
		assertEquals(16, game.score());
	}

	private void rollSpare() {
		game.roll(5);
		game.roll(5);
	}
}
