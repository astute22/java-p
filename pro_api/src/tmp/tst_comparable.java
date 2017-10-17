package tmp;

import java.util.Arrays;
import java.util.Comparator;

public class tst_comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,5,2,76,324,65467,43,2324,88,43431,4,221,34654,543,444,875,43,4};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		Game[] game = {
				new Game("GTA5","RPG",18),
				new Game("FM 2017","Sports Simulation",12),
				new Game("Unknown : BattleGround","RPG",18),
				new Game("Fallout4","RPG",18),
				new Game("DOTA2","AOS",18),
				new Game("Tekken 7","Fighting Game",15),
				new Game("Dark Soul3","RPG",18),
				new Game("Uncharted","Action Adventure",15),
				new Game("Tomb Rader : Reboot","Action Adventure",18),
				new Game("The Lord Of The Ring","RPG",15),
				};
		Arrays.sort(game, new Comparator<Game>(){
			public int compare(Game a, Game b){
				int res = a.getTitle().compareTo(b.getTitle());
				return res;
			}
		});
		System.out.println(Arrays.toString(game));
		
		Arrays.sort(game, new Comparator<Game>(){
			public int compare(Game a, Game b){
				if(a.getAgeRate() == b.getAgeRate())
					return a.getTitle().compareTo(b.getTitle());
				else return a.getAgeRate() - b.getAgeRate();
			}
		});
		System.out.println(Arrays.toString(game));

	}

}
