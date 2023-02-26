
public class MainChamber extends Chamber{
	
	public MainChamber(Chamber north, Chamber south, Chamber east, Chamber west) {
		
		this.setChamberName("MainChamber");
		this.setChamberDescription("The entrance is a dimly lit room with doors leading to the four chambers. The Charms Chamber lies to the North, the Alchemy Chamber lies to the West, the Herbology Chamber lies to the East and the Defense against the Dark Arts Chamber lies to the South.");
		this.setNumObjects(0);
		
		this.setRoomObjects(null);
		
		this.setProfessor(null);
	
		this.setSouthChamber(south);
		this.setNorthChamber(north);
		this.setEastChamber(east);
		this.setWestChamber(west);

		
		// TODO Auto-generated constructor stub
	}
}
