
public class Characters implements Talk{
	
	private String characterName;
	private String dialogue;
	
	public Characters(String characterName, String dialogue) {
		super();
		this.characterName = characterName;
		this.dialogue = dialogue;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println(dialogue);
	}
	
}
