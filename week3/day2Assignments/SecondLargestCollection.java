package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestCollection {

	public static void main(String[] args) {
			int[] data = {3,2,11,4,6,7};	
			List<Integer> lst1= new ArrayList<Integer>();
			for(Integer i : data) {lst1.add(i);}
			Collections.sort(lst1);
			System.out.println(lst1);
			System.out.println("Second largest number is "+lst1.get(lst1.size()-2));

	}

}
