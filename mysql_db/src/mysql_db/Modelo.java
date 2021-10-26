package mysql_db;

public class Modelo {
	String firstName;
	String lastName;
	int category;
	
	public Modelo(String firstName, String lastName, int category) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.category = category;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Modelo [firstName=" + firstName + ", lastName=" + lastName + ", category=" + category + "]";
	}
	

}
