
public class Objects implements Use{
	private String objectName;
	private String objectDescription;
	
	
	public Objects(String objectName, String objectDescription) {
		super();
		this.objectName = objectName;
		this.objectDescription = objectDescription;
	}


	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(objectDescription);
	}


	public String getObjectName() {
		return objectName;
	}


	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}


	public String getObjectDescription() {
		return objectDescription;
	}


	public void setObjectDescription(String objectDescription) {
		this.objectDescription = objectDescription;
	}

	
	


}
