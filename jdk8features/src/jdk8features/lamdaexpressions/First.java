package jdk8features.lamdaexpressions;

interface Abc {
	void printName();
}
public class First {

	public static void main(String[] args) {
	
		Abc abc = ()->System.out.println("Shubham");

		abc.printName();

	}

}


