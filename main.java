import java.util.Scanner;  
import java.util.Arrays;


public class main {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		String userInput = "";
		
		System.out.println("Program is RUNNING");
		
		/*
		userInput = myInput.nextLine();
		while (userInput != "I call forth the Founders' Stone")
		{
			userInput = myInput.nextLine();
		}
		*/
		
		System.out.println("Welcome to the Wizarding World of Hogwarts Legacy! You have discovered the Founders' Stone and unlocked the Legacy Chambers. You are now in the entrance of the chambers.");
		
		MainChamber mainChamber = new MainChamber(); 
		CharmsChamber charmsRoom = new CharmsChamber();

		Player player = new Player(mainChamber);
		
		while (true)
		{
			userInput = myInput.nextLine();
			String[] arrOfStr = userInput.split(" ", 5);
			
			
			String target = "";
			
			
			switch(arrOfStr[0])
			{
			case "use":
				target = (arrOfStr[1]+arrOfStr[2]);

				boolean objectFound = false;
				
				Objects[] presentObjects = player.getCurrentChamber().getRoomObjects();
				
				for (int i = 0; i < player.getCurrentChamber().getNumObjects(); i++)
				{
					if (target.equals(presentObjects[i].getObjectName()))
					{
						objectFound = true;
						presentObjects[i].use();
						break;
					}
				}
				if (objectFound == false)
				{
					System.out.println("That object was not found!");
				}
				break;
				
			case "look":
				target = arrOfStr[1];
				target = (arrOfStr[0] + " " + arrOfStr[1]);
				
				if (target.equals("look around"))
				{
					player.getCurrentChamber().lookAround();
				}
				else
				{
					System.out.println("Uh oh! Look at what :O?");
				}
				break;
			case "walk":
				target = arrOfStr[1];
				
				if (player.getCurrentChamber().getChamberName().equals("MainChamber"))
				{
					switch (target)
					{
					case "north":
						player.setCurrentChamber(charmsRoom);
						System.out.println("You have entered the Charms Chamber.");
						break;
					case "east":
						break;
					case "south":
						break;
					case "west":
						break;
						default:
							System.out.println("Uh oh! Invalid Direction!");
					}
				}
				
				else if(player.getCurrentChamber().getChamberName().equals("CharmsChamber"))
				{
					if (target.equals("south"))
					{
						player.setCurrentChamber(mainChamber);
						System.out.println("You have entered the Main Entrance.");
					}
					else
					{
						System.out.println("Uh oh! Invalid Direction");
					}
				}
				break;
			case "talk":
				target = arrOfStr[2] + arrOfStr[3];
				
				
				if (target.equals(player.getCurrentChamber().getProfessor().getCharacterName()))
				{
					player.getCurrentChamber().getProfessor().talk();
				}
				else
				{
					System.out.println("This individual was not found!");
				}
				
				break;
			
				
				default:
					System.out.println("Invalid Action!");
			}
			
			
		}
		
		
		
		
		// This class will take the inputs from the user and pass them through to the game.
		

	}

}
