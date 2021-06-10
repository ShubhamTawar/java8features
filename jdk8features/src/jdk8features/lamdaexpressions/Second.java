package jdk8features.lamdaexpressions;


interface Square{
	public int square(int x);
}

public class Second {
	public static void main(String[] args) {
		Square sqr = (int x)->{
							return x * x;
							};
		System.out.println(sqr.square(10));
	}
}