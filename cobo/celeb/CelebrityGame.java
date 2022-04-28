/*
uwu kittens: Anthony Sun, Ivina Wang, Jaylen Zeng
APCS pd 7
L09: Celebrity!
2022-04-26
time spent: 3.0 hrs
*/

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The framework for the Celebrity Game project
 * 
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */
	Celebrity gameCelebrity;
	/**
	 * The GUI frame for the Celebrity game.
	 */
	// CelebrityFrame gooey;
	/**
	 * The ArrayList of Celebrity values that make up the game
	 */
	ArrayList<Celebrity> celebGameList;

	Scanner in;
	/**
	 * Builds the game and starts the GUI
	 */
	public CelebrityGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		in = new Scanner(System.in);
		// gooey = new CelebrityFrame(this);
		prepareGame();
		play();
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	public void prepareGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		// gooey.replaceScreen("START");
	}

	/**
	 * Determines if the supplied guess is correct.
	 * 
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		return sendAnswer().toLowerCase().trim().equals( guess.toLowerCase().trim() );
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		while (input("Do you want to add a celebrity or start playing the game? (add/play): ").equals("add")) {
			pollCelebrity();
		}
		while (getCelebrityGameSize() != 0) {
			clear();
			playRound();
		}
	}

	public void playRound() {
		gameCelebrity = celebGameList.remove(0);
		String answer;
		do {
			System.out.println("Clue: "+gameCelebrity.getClue());
			answer = input("Guess (type \"give up\" to move on): ");
			if (answer.equals("give up")) break;
		}
		while (!processGuess(answer));
		System.out.println("You've finished! Congratulations.");
	}

	public String input(String input) {
		System.out.print(input);
		return in.nextLine();
	}

	public void clear() {
		System.out.print("\033[H\033[2J");  
    	System.out.flush(); 
	}

	public void pollCelebrity() {
		String name;
		String clue;
		String type;
		do {
			name = input("Celebrity name: ");
		}
		while (!validateCelebrity(name));


		do {
			clue = input("Clue: ");
			type = input("Type: ");
		}
		while (!validateClue(clue, type));
		addCelebrity(name, clue, type);
		
	}

	/**
	 * Adds a Celebrity of specified type to the game list
	 * 
	 * @param name
	 *            The name of the celebrity
	 * @param guess
	 *            The clue(s) for the celebrity
	 * @param type
	 *            What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
		Celebrity temp = new Celebrity("","");
		
		if (type.equals("Celebrity")) {
			temp = new Celebrity(name, guess);
		}
		if (type.equals("LiteratureCelebrity")) {
			temp = new LiteratureCelebrity(name, guess);
		}
		if (type.equals("GamingCelebrity")) {
			temp = new GamingCelebrity(name, guess);
		}
		
		celebGameList.add(temp);	

		
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
		return name.trim().length() >= 4;
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity 
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
			return clue.trim().length() >= 10;
	}
	/**
	 * Accessor method for the current size of the list of celebrities
	 * 
	 * @return Remaining number of celebrities
	 */
	public int getCelebrityGameSize()
	{
		return celebGameList.size();
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 * 
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return gameCelebrity.getClue();
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 * 
	 * @return The String answer from the current celebrity.
	 */
	public String sendAnswer()
	{
		return gameCelebrity.getAnswer();
	}
}
