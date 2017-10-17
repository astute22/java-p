package example5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class RentalService {
	List<Rental> repo = new ArrayList<>();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	//대여기능
	//대여정보전달받아서 저장
	public void rent(Rental rental){
		repo.add(rental);
	}
	
	//조회기능
	//책제목을 전달받아서 대여 정보 출력
	public void searchByTitle(String title){
		for(Rental r : repo){
			if(r.getTitle().contains(title)){
				displayInfo(r);
			}
		}
		
	}
	//고객명을 전달받아서 대여 정보 출력
	public void searchByUser(String username){
		for(Rental r : repo){
			if(r.getUsername().contains(username)){
				displayInfo(r);
			}
		}
	}
	//날짜를 전달받아서 대여정보 출력
	public void searchByRentDate(String strDate){
		for(Rental r : repo){
			if(r.getRentDate().contains(strDate)){
				displayInfo(r);
			}
		}
	}
	
	//반납기능
	//대여번호를 전달받아서 반납처리
	public void back(long rentNo){
		Date now = new Date();
		for(Rental r : repo){
			if(r.getNo()==rentNo){
				if(r.back()==0){
					r.setBack(1);
					r.setBackDate(sdf.format(now));
					System.out.println("반납이 완료되었습니다.");
				}else{
					System.out.println("대여중인 도서가 아닙니다.");
				}
					
			}
		}
	}
	public void displayInfo(Rental r){
		System.out.println(r.toString());
	}
	
	//모든 대여정보 출력
	public void displayAll(){
		for(Rental r : repo){
			System.out.println(r.toString());
		}
	}
	
	public RentalService() throws IOException{
		load();
	}
	
	//파일에서 로드
	public void load() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:/java_eclipse/workspace/pro_io/src/example5/rental.txt"),"euc-kr"));
		String str = null;
		while((str = br.readLine())!= null){
			String[] items = str.split(",");
			Rental rental = new Rental();
			rental.setNo(Long.parseLong(items[0]));
			rental.setTitle(items[1]);
			rental.setUsername(items[2]);
			rental.setRentDate(items[3]);
			rental.setBack(Integer.parseInt(items[4]));
			rental.setBackDate(items[5]);
			repo.add(rental);
		}
		br.close();
		
	}
	
	//파일에 저장
	public void store() throws IOException{
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("c:/java_eclipse/workspace/pro_io/src/example5/rental.txt"),"euc-kr"));
		for(Rental r : repo){
			pw.println(r.getNo()+","+r.getTitle()+","+r.getUsername()+","+r.getRentDate()+","+r.back()+","+r.getBackDate());
		}
		
		pw.close();
	}
}
