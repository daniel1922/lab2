import java.util.Scanner;

public class adventuregame {

	public static void main(String[] args) {
		
		//Enter name into variable
		Scanner sc = new Scanner(System.in);	
		System.out.println("Welcome to the undersea adventure! What is your name?(enter your name)");
		String enteredName = sc.nextLine();
		
		//Enter game answer into variable
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Would you like to sit on beach or swim with dolphins?(enter 1 for beach or 2 for dolphins)");
		String enteredGameAnswer = sc1.nextLine();
		
		switch (enteredGameAnswer){
		
		case "1":
		System.out.println("You decide to sit on the beach, but after an hour a unexpected tidal wave comes and kills you");	
		break;

		case "2":
		System.out.println("You swim towards the dolphins only to realize there are also a group of sharks."
				+ "What would you do??(enter \"face the sharks\" or \"swim away\")");
		String faceOrSwim = sc1.nextLine();
	
		switch (faceOrSwim){
		
		case "swim away":
		System.out.println("You are swimming back quickly when a shark comes out of nowhere and bites you in half.");	
		break;
		
		case "face the sharks":
		System.out.println("You swim towards the sharks. You see there are __ number of sharks (enter\"10\" or \"20\" or \"30\"):");
		int Number = sc1.nextInt();				
		System.out.println("You have never seen " + Number + "sharks this close before! You decide to fight.");
		System.out.println("Choose your weapon!(enter \"speargun\" or \"fist\" or \"bomb\")");
}

		Scanner sc3 = new Scanner(System.in);
		String yourWeapon = sc3.nextLine();	
		System.out.println("You swim to the sharks with " + yourWeapon + " in hand.");
		System.out.println("They stare at you with their ______ teeth. (enter \"red\" or \"white\")");
		
		Scanner sc4 = new Scanner(System.in);
		String dragonEye = sc4.nextLine();
}
