package week1day2.assignment;

public class Fibonacci {

	public static void main(String[] args) {
		int s = 10;
		int a=1;
		int b=0;
		System.out.println("The fibonacci series");
		for (int i=0;i< s;i++) {
			int  c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}
}