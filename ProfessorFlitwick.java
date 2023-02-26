
public class ProfessorFlitwick extends Characters implements Talk{

	public ProfessorFlitwick() {
		super("Professor Flitwick");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println(getCharacterName() + ": Greetings student! This is the Charms Chamber. Use the Charm Chest to practice your spells and interact with the animals in the Magical Menagerie to learn more about Charms.");
	}

}
