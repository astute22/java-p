package example5;

import java.io.IOException;

public class RentalServiceApp {

	public static void main(String[] args) throws IOException {

		RentalService service = new RentalService();
		
		service.searchByTitle("스프링");
		service.searchByUsername("홍길동");
		service.searchByDate("2017/07/04");
		
		service.back(1499157707848L);

		service.rent(new Rental("열혈강호", "김유신", "2017/07/05"));
		
		service.displayAll();
		
		service.store();
	}
}