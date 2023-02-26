
public class Player{
	
	private Chamber currentChamber;
	
	public Player(Chamber currentChamber) {
		super();
		this.currentChamber = currentChamber;
	}

	public Chamber getCurrentChamber() {
		return currentChamber;
	}

	public void setCurrentChamber(Chamber currentChamber) {
		this.currentChamber = currentChamber;
	}

	public void walk(String direction) {
		// TODO Auto-generated method stub
		if (direction == "north")
		{
			if (currentChamber.getNorthChamber() == null)
			{
				System.out.println("Invalid Direction");
			}
			else
			{
				this.currentChamber = this.currentChamber.getNorthChamber();
			}
		}
		else if (direction == "east")
		{
			if (currentChamber.getEastChamber() == null)
			{
				System.out.println("Invalid Direction");
			}
			else
			{
				this.currentChamber = this.currentChamber.getEastChamber();
			}
		}
		else if (direction == "south")
		{
			if (currentChamber.getSouthChamber() == null)
			{
				System.out.println("Invalid Direction");
			}
			else
			{
				this.currentChamber = this.currentChamber.getSouthChamber();
			}
		}
		else if (direction == "west")
		{
			if (currentChamber.getWestChamber() == null)
			{
				System.out.println("Invalid Direction");
			}
			else
			{
				this.currentChamber = this.currentChamber.getWestChamber();
			}
		}
		
	}
	
	public void lookAround()
	{
		System.out.println(currentChamber.getChamberDescription());
	}

}
