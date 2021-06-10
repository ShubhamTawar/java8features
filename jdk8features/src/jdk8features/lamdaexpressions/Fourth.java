package jdk8features.lamdaexpressions;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

	public class Fourth{
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();

			list.add(10);
			list.add(2);
			list.add(30);
			list.add(300);

			System.out.println(list);

			Collections.sort(list);

			System.out.println(list);

			Collections.sort(list , (a , b)->b - a);

			System.out.println(list); 
		}
	}
