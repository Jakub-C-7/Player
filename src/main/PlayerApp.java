package main;
import java.util.ArrayList;
import lib.Player;

/**
 * PlayerApp program that tests the functionality of the Player Class by searching through an
 * ArrayList of players to find every Player with a full name that contains a specific letter.
 * If full name contains letter, store the Player's first name in the String 'result' in lower case
 * and family name in the String 'result' in upper case. Once all elements in the list are searched
 * through, return the 'result' variable.
 * 
 * @author Jakub Chamera - P2409490
 */

public class PlayerApp {

	public static String execute(ArrayList<Player> players, String fullName) {
		
		players.get(0).setFullPlayerName(fullName);
		String result = "";
		 
		 for (int i = 0; i < players.size(); i++) {
			 
			 if (players.get(i).getName().getFullName().contains("a")
					 ||players.get(i).getName().getFullName().contains("A")) {
				 
				 result = result + players.get(i).getName().getFirstName().toLowerCase() +
						 ", " + players.get(i).getName().getFamilyName().toUpperCase() + "\n" ;
			}
 
		}
		 return result;
	}
	
}


