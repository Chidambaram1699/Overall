package week3.day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split(" ");
		Set<String> set1 = new LinkedHashSet<String>();
		for(String i : text1) {
			set1.add(i);
		}
		System.out.println(set1);
	}

}
