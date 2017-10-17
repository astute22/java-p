package tmp;

public class User {
	private String id;
	private String pw;
	private String nat;
	private long balance;
	private Game[] game = new Game[100];
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String id, String pw, String nat) {
		super();
		this.id = id;
		this.pw = pw;
		this.nat = nat;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	public Game[] getGame() {
		return game;
	}
	public void setGame(Game[] game) {
		this.game = game;
	}
	
}
