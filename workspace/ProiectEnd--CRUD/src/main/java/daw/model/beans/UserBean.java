package daw.model.beans;

public class UserBean {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	public boolean valid;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public void removePassword() {
		password = null;
	}

	public String getUsername() {
		return username;
	}

	public void setUserName(String newUsername) {
		username = newUsername;
	}

	public void removeUserName() {
		username = null;
	}

	public void removeLastName() {
		lastName = null;
	}

	public void removeFirstName() {
		firstName = null;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean newValid) {
		valid = newValid;
	}
}