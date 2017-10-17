package example6;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo3 {
	public static void main(String[] args) {
	
		Student[] ar1 = {
				new Student(10,"린가드", 60),
				new Student(4,"제라드", 100),
				new Student(7,"루니", 65),
		};
		Student[] ar2 = {
				new Student(30,"이명주", 65),
				new Student(52,"김진수", 45),
				new Student(76,"장현수", 40),
		};
		//성적기준
		Comparator<Student> comparatorScore = new Comparator<Student>(){
			public int compare(Student a, Student b){
				return b.getScore() - a.getScore();
			}
		};
		
		//이름기준
		Comparator<Student> comparatorName = new Comparator<Student>(){
			public int compare(Student a, Student b){
				return a.getName().compareTo(b.getName());
			}
		};
		
		Arrays.sort(ar1, comparatorName);
		Arrays.sort(ar2, comparatorScore);
		//Arrays.sort(ar2, new ScoreComparator());
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
	}
	public static class ScoreComparator implements Comparator<Student>{
		public int compare(Student a, Student b){
			return b.getScore() - a.getScore();
		}
	}
}
