package example3;

import java.io.IOException;
import java.util.List;

public class HumanResourCeApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HumanResourceRepository repository = new HumanResourceRepository();
		List<HumanResource> result = repository.searchRecordsByOrganization("go");
		System.out.println("조회건수 : " + result.size());
	}
}
