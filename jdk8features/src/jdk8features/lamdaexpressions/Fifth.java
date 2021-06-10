package jdk8features.lamdaexpressions;

import java.util.*;

class Student {
	int id;
	String name;

	Student(int id , String name) {
		this.id = id;
		this.name = name;
	}

	@Override

	public String toString() {
		return id + " " + name;
	}
}


public class Fifth {
	public static void main(String[] args) {
		//PriorityQueue<Student> pq = new PriorityQueue<>((s1 , s2)-> s1.id - s2.id);
		PriorityQueue<Student> pq = new PriorityQueue<>((s1 , s2)-> s2.id - s1.id);

		pq.add(new Student(10 , "Shubham"));
		pq.add(new Student(20 , "Tawar"));
		pq.add(new Student(1 , "Shubham"));
		pq.add(new Student(23 , "Tawar"));

		while(!pq.isEmpty())
			System.out.println(pq.remove());

	}
}