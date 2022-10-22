package week3.day1Assignment;

public class PalindromeChar {

	public static void main(String[] args) {
		String text = "madam";
		String text1="";
		int num = text.length();
		for(int i=(num-1);i>=0;i--) {
			text1 = text1 + text.charAt(i);
		}
		System.out.println(text1+" "+text);
		if(text.equals(text1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}
		
}
}
