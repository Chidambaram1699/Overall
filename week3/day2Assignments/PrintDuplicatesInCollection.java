package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInCollection {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> lst1= new ArrayList<Integer>();
		for(Integer i : arr) {lst1.add(i);}
		Collections.sort(lst1);
		List<Integer> lst2 = lst1 ;
		List<Integer> lst3= new ArrayList<Integer>();
		int count =0;
		for(int i =0 ;i<lst1.size();i++) {
			for(int j = i+1;j < lst2.size();j++) {
				if(lst1.get(i).equals(lst2.get(j))) {
					lst3.add(lst2.get(j));
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println("The Duplicate numbers are "+ lst3);
		}else {
			System.out.println("There is no duplicates");
		}
		
	}
	}
