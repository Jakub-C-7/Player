package main;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import lib.Die;
import lib.Name;
import lib.PairOfDice;
import lib.Player;

public class PlayerAppTest {
	
	@Test
	public void testExecute() {
		ArrayList<Player> players = new ArrayList<>();
		players.add(new Player(new Name("Joe", "Bloggs"), new PairOfDice()));
		players.add(new Player(new Name("Fred", "Jones"), new Die()));
		players.add(new Player(new Name("Nila", "Singh"), new PairOfDice(new Die(5), new Die(5))));		
		
		String result = PlayerApp.execute(players, "Cassie Downturn");
		
		String expectedResult = "cassie, DOWNTURN\nnila, SINGH\n";
		
		assertEquals("The string returned should match the expected result (run 1)", expectedResult, result);
		
		
		/* Test with a second set of input data */
		ArrayList<Player> players2 = new ArrayList<>();
		players2.add(new Player(new Name("David", "Blunt"), new PairOfDice()));
		players2.add(new Player(new Name("Tim", "Jonas"), new Die(5)));
		players2.add(new Player(new Name("Remi", "Patel"), new Die()));		
				
		String result2 = PlayerApp.execute(players2, "Cassie Downturn");
		
		String expectedResult2 = "cassie, DOWNTURN\ntim, JONAS\nremi, PATEL\n";
		
		assertEquals("The string returned should match the expected result (run 2)", expectedResult2, result2);
	}
	
}
