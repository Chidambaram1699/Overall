package week3.day1Assignment;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String text="changeme";
		char[] cA = text.toCharArray();
		for(int i =0;i< cA.length;i++) {
			if((i%2)==0) {
				char upr = Character.toUpperCase(cA[i]);
				System.out.print(upr);
			}else {
				System.out.print(cA[i]);
			}
		}
	}

}
