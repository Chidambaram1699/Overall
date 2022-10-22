package week1day2.assignment;

public class Primenumber {

	public static void main(String[] args) {
		int num = 13;
		int q = 0;
		for(int i=2;i<=(num-1);i++) {
			if (num%i==0) {
				q++;
			}
		}
		if(q>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
		}
	}


