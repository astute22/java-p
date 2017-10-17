package example3;

public class BoxApp {
	public static void main(String[] args) {
		Box<String> names = new Box<String>();
		names.add("임요환");
		names.add("홍진호");
		names.add("박정석");
		names.add("강민");
		names.add("전태규");
		names.add("조용호");
		names.add("변길섭");
		names.add("이윤열");
		names.add("최연성");
		names.add("이영호");
		names.add("이제동");
		names.add("송병구");
		names.add("김택용");

		System.out.println("names box의 크기 : " + names.size());
		
		Box<Computer> com = new Box<Computer>();
		com.add(new Computer(1, "한성컴퓨터", "한성", 1000000));
		com.add(new Computer(1, "삼보컴퓨터", "삼보", 1000000));
		com.add(new Computer(1, "LG컴퓨터", "LG", 1000000));
		com.add(new Computer(1, "Dell컴퓨터", "Dell", 1000000));
		com.add(new Computer(1, "레노버 컴퓨터", "레노버", 1000000));
		com.add(new Computer(1, "늑대와 여우컴퓨터", "늑대와 여우", 1000000));
		com.add(new Computer(1, "IBM컴퓨터", "IBM", 1000000));
		com.add(new Computer(1, "맥북", "애플", 1000000));
		com.add(new Computer(1, "맥킨토시", "애플", 1000000));
		com.add(new Computer(1, "조립컴퓨터", "없음", 1000000));
		
		Box<Customer> customers = new Box<Customer>();
		customers.add(new Customer("boxer","임요환","010-1111-1111"));
		customers.add(new Customer("yellow","홍진호","010-2222-2222"));
		customers.add(new Customer("reach","박정석","010-1111-2222"));
		customers.add(new Customer("nada","이윤열","010-1111-3333"));
		customers.add(new Customer("flash","이영호","010-1111-1112"));
		customers.add(new Customer("bisu","김택용","010-1111-1113"));
		customers.add(new Customer("jaedong","이제동","010-1111-1114"));
		
		Customer c1 = customers.get(0);
		System.out.println(c1.toString());
	}
}
