/*  # TASK 2
	# Compulsory Task 1
	# rockPaperScissors.java
	# written by Tintswalo Anicky Makhubele
	# date:  11 April 2020
	# Function: This program allows the user to play rock, paper, scissors.
*/

// import Random package
import java.util.Random;

// import Scanner package
import java.util.Scanner;

public class rockPaperScissors {
	
// method to generate the computer's choice	
public static String generateRandomChoice(Random random) {
	int choiceNumber;
	
	//The program should randomly generate a number (0, 1 or 2), which represents scissors, rock and paper,
	choiceNumber = random.nextInt( 3 );
	String computerChoice = "";
	
	if (choiceNumber == 0 ) {
		computerChoice = "rock";
	} else if (choiceNumber == 1 ) {
		computerChoice = "paper";
	} else if (choiceNumber == 2 ) {
		computerChoice = "scissors";
		}
		System.out.println("The computer has made a choice!\n");
		
		// return the computer's random choice
		return computerChoice;
	}

// method to read user's choice from the user.
public static String userInput (Scanner scanner) {
	
	// The user should chose a number (0, 1 or 2), which represents scissors, rock and paper,
	System.out.println("Enter your choice (0, 1 or 2): ");
	int userChoice;
	userChoice = scanner.nextInt(3);
	String choiceEntered = "";
	
	if (userChoice == 0 ) {
		choiceEntered = "rock";
	} else if (userChoice == 1 ) {
		choiceEntered = "paper";
	} else if (userChoice == 2 ) {
		choiceEntered = "scissors";
		}
		// return the user's choice
		return choiceEntered;
}
 // method to determine the winner between the computer and the user.
public static String chooseWinner ( String computer, String user) {
	
	/* The rules of the game are as follows:
		1.Scissors beats paper
		2.Rock beats scissors
		3.Paper beats rock		 
	 */
	String winner = "YOU DRAW!";
	String message;
	
	// messages to be displayed depending on the computer and user choice
	String rockMessage = "The rock smashes the scissors!";
	String scissorsMessage = "Scissors cuts paper!";
	String paperMessage = "Paper wraps rock!";
	
	if (computer.equals("rock") && user.equals("scissors")) {
		message = rockMessage;
		winner = message + "\nYOU LOSE!";
		
	} else if(user.equals("rock") && computer.equals("scissors")) {
		message = rockMessage;
		winner = message + "\nYOU WON!";
	}
	if (computer.equals("scissors") && user.equals("paper")) {
		message = scissorsMessage;
		winner = message + "\nYOU LOSE!";
		
	} else if(user.equals("scissors") && computer.equals("paper")) {
		message = scissorsMessage;
		winner = message + "\nYOU WON!";
	}
	if (computer.equals("paper") && user.equals("rock")) {
		message = paperMessage;
		winner = message + "\nYOU lOSE!";
		
	} else if(user.equals("paper") && computer.equals("rock")) {
		message = paperMessage;
		winner = message + "\nYOU WON!";
		}
		
		// return the winner of the game
		return winner;

}

public static void main(String[] args) {
		
		// call the random package to determine the computer's choice.
		Random random = new Random();
		
		// call the scanner package to read the user's choice.
		Scanner scanner = new Scanner(System.in);
		
		// display the game's options the user can chose from
		System.out.println("Game options:\n 0 for rock\n 1 for paper\n 2 for scissors\n");
		
		// store the computer's choise in the variable called computer.
		String computer = generateRandomChoice(random);
		
		// store the user's choice in the variable called user.
		String user = userInput(scanner);
		
		// dispay the user's choice and the computer's choice.
		System.out.println("You chose " + user + "\nThe computer chose " + computer);
		
		// print out the winner.
		System.out.println(chooseWinner ( computer, user));
		
		// if it's a draw ,the user must be asked to play again until there is a winner.
		while(chooseWinner ( computer, user).equals("YOU DRAW!")) {
			System.out.println("\nPlease try again!");
			
			// store the computer's choise in the variable called computer.
			computer = generateRandomChoice(random);
			
			// store the user's choice in the variable called user.
			user = userInput(scanner);
			
			// dispay the user's choice and the computer's choice.
			System.out.println("You chose " + user + "\nThe computer chose " + computer);
			
			System.out.println(chooseWinner ( computer, user)); // print out the winner.
		}	
		
	}

}
//***********************************************************END*********************************************************************