
public abstract class Chamber {
	
	private String chamberName;
	private String chamberDescription;
	private Objects[] roomObjects;
	private Characters Professor;
	private int numObjects;
	
	
	private Chamber northChamber;
	private Chamber southChamber;
	private Chamber eastChamber;
	private Chamber westChamber;

	
	public Chamber getNorthChamber() {
		return northChamber;
	}

	public void setNorthChamber(Chamber northChamber) {
		this.northChamber = northChamber;
	}

	public Chamber getSouthChamber() {
		return southChamber;
	}

	public void setSouthChamber(Chamber southChamber) {
		this.southChamber = southChamber;
	}

	public Chamber getEastChamber() {
		return eastChamber;
	}

	public void setEastChamber(Chamber eastChamber) {
		this.eastChamber = eastChamber;
	}

	public Chamber getWestChamber() {
		return westChamber;
	}

	public void setWestChamber(Chamber westChamber) {
		this.westChamber = westChamber;
	}

	public Chamber() {
		super();
	}

	public String getChamberName() {
		return chamberName;
	}

	public void setChamberName(String chamberName) {
		this.chamberName = chamberName;
	}

	public String getChamberDescription() {
		return chamberDescription;
	}

	public void setChamberDescription(String chamberDescription) {
		this.chamberDescription = chamberDescription;
	}

	public Objects[] getRoomObjects() {
		return roomObjects;
	}

	public void setRoomObjects(Objects[] roomObjects) {
		this.roomObjects = roomObjects;
	}

	public int getNumObjects() {
		return numObjects;
	}

	public void setNumObjects(int numObjects) {
		this.numObjects = numObjects;
	}

	public Characters getProfessor() {
		return Professor;
	}

	public void setProfessor(Characters professor) {
		Professor = professor;
	}
	
	public void lookAround()
	{
		System.out.println(chamberDescription);
	}
	
}
