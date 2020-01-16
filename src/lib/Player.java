package lib;

/** 
 * A Player class represents a Player's full name (first and last name) and dice.
 * This class consists of set methods, get methods, methods to roll and get dice scores,
 * a compareTo method and a setFullPlayerName method. The Player class implements the 
 * Comparable interface and therefore imposes a total ordering of objects, the compareTo 
 * method is referred to as its natural comparison.
 *
 * @author Jakub Chamera - P2409490
 */

public class Player implements Comparable<Player> {
	
		/**
		 * Fields
		 */
		private Name name;
		private Rollable dice = new PairOfDice();
	
		
		/**
		 * Default constructor. Creates a new name of type Name with a 
		 * firstName and lastName. Sets the initial value of firstName to empty string "" and
		 * sets the initial value of lastName to empty string ""
		 */
		public Player() {
			name = new Name();
			
			}
		/**
		 * Allowing the constructor to use the name parameter to build the Player name field
		 * @param name The name of the Player
		 */
		 public Player(Name name) {
			 this.name = name;
		 	}
		 
		 /** 
		  * Allowing the constructor to use the name and dice parameters in one function to
		  * build Player name and Player dice fields
		  * @param name The name that the Player will have
		  * @param dice The dice that the Player will have
		  */
		 public Player(Name name, Rollable dice) {
			 this.name = name;
			 this.dice = dice;
		 }
		 
		 //Methods
		/**
		 * The setName method takes a parameter of name and assigns it to the Player name field
		 * @param name The name that's being assigned to the Player name field
		 */
		 public void setName(Name name) {
			this.name = name; 
		    }
		 
		 /**
		  * The getName method returns the Player full name that's assigned under the name field
		  * @return Returns the name parameter
		  */
		 public Name getName() {
	    	return name; 
		    }
		 
		 
		 /**
		  * The rollDice method rolls the dice and assigns the score to the dice field.
		  * @param dice The dice that's being used to roll
		  */
		 public void rollDice() {
			this.dice.roll(); 
		 	}
		 
		 
		 /**
		  * The getDiceScore method returns the outcome of the rollDice method.
		  * @return Returns the score of this dice
		  */
		 public int getDiceScore() {
			return this.dice.getScore(); 
		 	}
		 
		 /** 
		  * The getRollable method returns the current instance held by the Rollable field
		  * @return Returns the Rollable type held by dice
		  */
		 public Rollable getRollable() {
			    return this.dice; 
			    }
		 
		 /**
		  * The setFullPlayerName method takes a name parameter and separates it into different
		  * arrays as strings using the split method. The split method separates these based on 
		  * the space between them.
		  * The setFirstName and setFamilyName methods assign the first and last name appropriately to
		  * position 0 and 1 in the array. String array position [0] is used to store the first name and 
		  * string array position [1] is used to store the last name.
		  * 
		  * @param name String with the player's full name
		  */
		 public void setFullPlayerName(String name) {
			 
			 String[] firstAndLastSplit = name.split(" ");
			 
			 this.name.setFirstName(firstAndLastSplit[0]);
			 this.name.setFamilyName(firstAndLastSplit[1]);
			}
		 
		 
		 /**
		  * The compareTo method takes the input of a type Player and compares the current
		  * Player name to the 'other' Player input
		  * 
		  * @param other The input of type Player being used as a comparison
		  * @return Returns the result of the comparison
		  */
		public int compareTo(Player other) {
			int result = name.compareTo(other.name);
					return result;
		}
		
		//NEW METHOD
		public boolean hasName(Name n) {
			
			if (n.equals(null) && this.name.getFullName().equals(null)) {
				return true;
			}
			
			else if (this.name.getFullName().equals(n.getFullName())) {
				return true;
				
			
			}
			else {
				return false;
			}
			
		}
		
		/** 
		 * The toString method makes it possible to return the player name and dice score
		  * in a string format by converting it. This also makes it easily compatible with 
		  * system.out.println methods.
		  */
		 public String toString() {
			 return "Player:[" + name + ", " + dice + "]" ;
		 }
		 
	}



