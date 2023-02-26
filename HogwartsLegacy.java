
public class HogwartsLegacy {
	// The actual class that will instantiate the game and link together all the rooms and so forth
	
	MainChamber mainChamber;
	CharmsChamber charmsRoom = new CharmsChamber(mainChamber);
	Player player = new Player(mainChamber);
	
	
}
