package example4;

public class Auth<I,P> {
	private I id;
	private P pw;
	public Auth(I id, P pw){
		this.id = id;
		this.pw = pw;
	}
	public I getId(){
		return id;
	}
	public P getPw(){
		return pw;
	}
	
}
