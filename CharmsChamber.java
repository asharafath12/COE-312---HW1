
public class CharmsChamber extends Chamber {

	public CharmsChamber(Chamber mainChamber) {
		
		this.setChamberName("CharmsChamber");
		this.setChamberDescription("You see Professor Flitwick and a Charm Chest. There is also a Magical Menagerie filled with animals used in spells");
		this.setNumObjects(2);
		
		Objects[] roomObjects = new Objects[2];
		
		roomObjects[0] = new CharmsChest();
		roomObjects[1] = new MagicalMenagerie();
		
		this.setRoomObjects(roomObjects);
		
		Characters charmsProfessor = new ProfessorFlitwick();
		this.setProfessor(charmsProfessor);
		
	
		this.setSouthChamber(mainChamber);
		
		this.setNorthChamber(null);
		this.setEastChamber(null);
		this.setWestChamber(null);

		
		
		// TODO Auto-generated constructor stub
	}

}
