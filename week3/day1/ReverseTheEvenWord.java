package week3.day1;

public class ReverseTheEvenWord {

	public static void main(String[] args) {
		String name ="Testleaf located in chennai";
		String[] name1 = name.split(" ");
		for (int i=0;i<name1.length;i++) {
			char[] arr1 = name1[i].toCharArray();
			if((i%2)!=0) {
				for(int j=arr1.length;j>0;j--) {
				System.out.println(arr1[j-1]);
		}
		}else {
			System.out.println(name1[i]);
		}
	}
	}
	}
