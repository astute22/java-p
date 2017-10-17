package example7;

import java.util.Set;

public class User {

	private String name;
	private String type;	//우편("P"), 전화("C"), 이메일("E"), 문자("M")
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
