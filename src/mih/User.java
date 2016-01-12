package mih;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.TabChangeEvent;

@ManagedBean(name = "user")
@SessionScoped
public class User implements Serializable {
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void onChange(TabChangeEvent event) {
        System.out.println("Tab Changed :: You've Requested Seeing :: "+ event.getTab().getTitle());
    }
}