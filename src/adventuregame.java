import java.util.Scanner;

public class adventuregame {

	public static void main(String[] args) {
		
		//Enter name into variable
		Scanner sc = new Scanner(System.in);	
		System.out.println("Welcome to the undersea adventure! What is your name?(enter your name)");
		String enteredName = sc.nextLine();
		
		//Enter game answer into variable
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Would you like to dive into a deep cave or swim with dolphins?(enter 1 for cave or 2 for dolphins)");
		String enteredGameAnswer = sc1.nextLine();
		
		switch (enteredGameAnswer){
		
		case "1":
		System.out.println("You dive into a deep cave and you spot a large neon orange fish with large teeth. Enter 1 to catch or 2"
				+ "to take a photo");	
		break;

		case "2":
		System.out.println("You swim towards the dolphins only to realize there are also a group of sharks. Do you "
				+ "What would you do??(enter \"face the sharks\" or \"swim away\")");
String faceOrSwim = sc1.nextLine();
	}

}
