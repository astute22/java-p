package tmp;

public class Game {
	private String title;
	private String genre;
	private int ageRate;
	public Game() {
		// TODO Auto-generated constructor stub
	}
	public Game(String title, String genre, int ageRate) {
		super();
		this.title = title;
		this.genre = genre;
		this.ageRate = ageRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAgeRate() {
		return ageRate;
	}
	public void setAgeRate(int ageRate) {
		this.ageRate = ageRate;
	}
	@Override
	public String toString() {
		return "Game [title=" + title + ", genre=" + genre + ", ageRate=" + ageRate + "]";
	}
	
}
