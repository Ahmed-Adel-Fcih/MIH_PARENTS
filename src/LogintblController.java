import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "logintblController")
@SessionScoped
public class LogintblController implements Serializable {

	private String message;
	private String username;
	private String password;

	public void validateLogin() {
		if (username.equalsIgnoreCase("Bassem")
				&& password.equals("ahlawy4ever")) {
			message = "Valid User";
		} else {
			message = "In valid User";
		}
	}

	public String getMessage() {
		return message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
