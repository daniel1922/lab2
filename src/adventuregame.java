import java.util.Scanner;

public class adventuregame {

	public static void main(String[] args) {
		
		//Enter name into variable
		Scanner sc = new Scanner(System.in);	
		System.out.println("Welcome! What is your name?(enter your name)");
		String enteredName = sc.nextLine();
		
		//Enter game answer into variable
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Would you like to play a game?(enter yes or no)");
		String enteredGameAnswer = sc1.nextLine();
	}

}
