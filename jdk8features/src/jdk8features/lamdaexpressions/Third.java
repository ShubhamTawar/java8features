package jdk8features.lamdaexpressions;


interface Addition{
	public int add(int a , int b);
}

public class Third {

	public static void main(String[] args) {
		
		Addition ad = (a , b)->a + b;
		System.out.println(ad.add(10 , 20));
	}
}