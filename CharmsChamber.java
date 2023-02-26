
public class CharmsChamber extends Chamber {

	public CharmsChamber() {
		
		this.setChamberName("CharmsChamber");
		this.setChamberDescription("You see Professor Flitwick and a Charm Chest. There is also a Magical Menagerie filled with animals used in spells");
		this.setNumObjects(2);
		
		Objects[] roomObjects = new Objects[2];
		
		roomObjects[0] = new Objects("CharmChest", "The Charm Chest contains spell ingredients such as wands, incantations, and spell books.");
		roomObjects[1] = new Objects("MagicalMenagerie","The Magical Menagerie is filled to the brim with all kinds of cages. The cages had all kinds of animals:  Streelers, Fire Crabs, sleek black rats that were very intelligent, owls, ravens, cats of every colour, Puffskeins, transforming rabbits and much more.[2]");
		
		
		this.setRoomObjects(roomObjects);
		
		Characters charmsProfessor = new Characters("ProfessorFlitwick", "Greetings student! This is the Charms Chamber. Use the Charm Chest to practice your spells and interact with the animals in the Magical Menagerie to learn more about Charms.");
		this.setProfessor(charmsProfessor);
		
	
		this.setSouthChamber(null);
		this.setNorthChamber(null);
		this.setEastChamber(null);
		this.setWestChamber(null);

		// TODO Auto-generated constructor stub
	}

}
