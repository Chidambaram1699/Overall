package week1day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int temp=num;
		int num1,num2=0;
		while(temp!=0) {
			num1=temp%10;
			num2=num2*10+num1;
			temp=temp/10;
}
		if(num2==num) {
			System.out.println("palindrome");
		}else {
			System.out.println("no palindrome");
		}
	}
}