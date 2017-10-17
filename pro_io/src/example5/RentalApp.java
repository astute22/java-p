package example5;

import java.io.IOException;

public class RentalApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RentalService rs = new RentalService();
		Rental rental = new Rental();
		rs.rent(new Rental("밀란탈출기","지안루이지 돈나룸마"));
		rs.searchByTitle("로또");
		rs.searchByUser("훔바훔바");
		rs.searchByRentDate("2017/07/04");
		rs.back(149957707848L);
		rs.displayAll();
		rs.store();
	}

}
