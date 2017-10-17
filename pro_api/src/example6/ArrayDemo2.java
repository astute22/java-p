package example6;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student[] st = {
					new Student(10,"린가드",60),
					new Student(15,"제라드",100),
					new Student(80,"램파드",95),
					new Student(42,"스콜스",80),
					new Student(36,"루니",75),
					new Student(27,"마샬",80),
					new Student(7,"긱스",77),
			};
			Arrays.sort(st);
			System.out.println(Arrays.toString(st));
			
			//Arrays의 sort(Object[] arr, Comparator c)은 Comparator인터페이스의 compare()메소드에 구현된 내용을 참조해서 배열을 정렬한다.
			Arrays.sort(st, new Comparator<Student>() {
				public int compare(Student a, Student b){
					int value = b.getScore() - a.getScore();
					if(value ==0){
						return a.getNo() - b.getNo();
					}else return value;
				}
			});
			System.out.println(Arrays.toString(st));
	}

}
