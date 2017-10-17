package ch08;

public class EventBean {
	private int id;
	private String title;
	private String owner;
	private String content;
	
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content = content;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String onwer){
		this.content = onwer;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.content = title;
	}
}
