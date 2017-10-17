package tmp;

import java.util.Scanner;

public class SteamMgr {
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
	User[] user = new User[100];
	int count = 0;
	//회원등록
	//로그인
	//게임등록
	//게임조회
	//게임삭제
	//로그아웃
	Scanner sc = new Scanner(System.in);
	public void menu(){
		System.out.println("스팀에 오신걸 환영합니다.");
		System.out.println("1.회원등록 | 2.로그인 | 3.게임등록 | 4.게임조회 | 5.게임삭제 | 6.로그아웃 | 7.프로그램종료");
		System.out.print("선택> ");
		int c = sc.nextInt();
		if(c == 1){
			addUser();
		}
	}
	public void addUser(){
		String tmp;
		System.out.print("아이디를 입력하시오 : ");
		User u = new User();
		tmp = sc.next();
		if(count!=0){
			boolean tf = FindId(user, tmp);
			if(tf)
				u.setId(tmp);
		}else u.setId(tmp);
		System.out.print("비밀번호를 입력하시오 : ");
		tmp = sc.next();
		u.setPw(tmp);
		System.out.print("국가를 입력하시오 : ");
		tmp = sc.next();
		u.setNat(tmp);
		user[count] = u;
		count++;
		System.out.println("회원등록이 완료되었습니다.");
		menu();
	}
	public void login(){
		String tmp;
		System.out.print("아이디를 입력하시오 : ");
		tmp = sc.next();
		if(user[0].getId()!=null){
			boolean tf = FindId(user, tmp);
			if(tf){
				System.out.print("비밀번호를 입력하시오 : ");
				tmp = sc.next();
			}
		}
		
	}
	public boolean FindId(User[] user,String id){
		for(User u : user ){
			if(u != null){
				if(!u.getId().equals(id))
					return true;
				else System.out.println("중복된 닉네임입니다.");
			}
		}return false;
	}
	public boolean FindPw(User user, String pw){
		if(!user.getPw().equals(pw))
			return true;
		else System.out.println("로그인에 성공하셨습니다.");
		return false;
	}
	
}
