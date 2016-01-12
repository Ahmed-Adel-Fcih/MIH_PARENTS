package mih;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

@ManagedBean(name = "notification")
@ViewScoped
public class Notifications {
	private List<String> unread = new ArrayList<String>();;
	private MenuModel unreadMenu;
	private int unreadCount;

	@PostConstruct
	public void initUnread() {
		unread.add("bassem");
		unread.add("Gemi");
		unread.add("dola");
		unreadMenu = new DefaultMenuModel();
		Integer menuItemId = 1;
		for (String nachricht : unread) {
			menuItemId++;
			DefaultMenuItem menuItem = new DefaultMenuItem(nachricht);
			menuItem.setId(menuItemId.toString());
			String nachrichtIdString = nachricht;
			menuItem.setCommand("#{notification.show('" + nachrichtIdString
					+ "')}");
			// menuItem.setCommand(String.format("#{nachrichtTeaserController.show('%d')}",unread.indexOf(n)));
			unreadMenu.addElement(menuItem);
		}
	}

	public String show(String nachrichtIdString) {
		return show(nachrichtIdString);
	}

	public List<String> getUnread() {
		return unread;
	}

	public void setUnread(List<String> unread) {
		this.unread = unread;
	}

	public MenuModel getUnreadMenu() {
		return unreadMenu;
	}

	public void setUnreadMenu(MenuModel unreadMenu) {
		this.unreadMenu = unreadMenu;
	}

	public void save() {

	}

	public void update() {

	}

	public void delete() {

	}

	public int getUnreadCount() {
		return unreadCount;
	}

	public void pullNewNotifications() {
		initUnread();
		unreadCount++;
	}

}
