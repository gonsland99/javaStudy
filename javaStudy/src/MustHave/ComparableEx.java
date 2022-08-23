package MustHave;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name +" : "+age;
	}
	
	public int compareTo(Student p) {
		//return this.age - p.age;
		//return p.age - this.age;
		//return this.name.compareTo(p.name);
		return p.name.compareTo(this.name);
	}
}

public class ComparableEx {
	public static void main(String[] args) {
		Set<Student> tree = new TreeSet<>();
		tree.add(new Student("홍길동",30));
		tree.add(new Student("전우치",40));
		tree.add(new Student("손오공",20));
		
		for(Student s : tree)
			System.out.println(s);
	}
}
