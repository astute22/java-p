package ch07;

public class LoginBean2 {
	//member variables
	private String userid;
	private String passwd;
	private String error;
	//method
	public boolean checkUser(){
		if(userid.equals("myuser")&&passwd.equals("1234")) return true;
		else return false;
	}
	public String getUserid(){
		return userid;
	}
	public void setUserid(String userid){
		this.userid = userid;
	}
	public String getPasswd(){
		return passwd;
	}
	public void setPasswd(String passwd){
		this.passwd = passwd;
	}
	public String getError(){
		return error;
	}
	public void setError(String error){
		this.error = error;
	}
}
