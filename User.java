package Project;

class User {
	private String Name;
	public User(String Name) {
		if (Name == null || Name.isBlank()) {
		    throw new IllegalArgumentException("Name cannot be empty.");
		}

		this.Name = Name;
		
	}

}
