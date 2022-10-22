package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementCollection {

	public static void main(String[] args) {
				int[] arr = {1,2,3,4,7,6,8};
				List<Integer> lst1= new ArrayList<Integer>();
				for(Integer i : arr) {lst1.add(i);}
				Collections.sort(lst1);
				for(int i = 0 ; i<lst1.size();i++) {
					if(lst1.get(i)!=(i+1)) {
					System.out.println("The missing number is "+(i+1));
					break;
					}					
				}
	}

}
