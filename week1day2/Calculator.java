package week1day2;

public class Calculator {
	
	public void addNum(int num1,int num2) {
	System.out.println(num1+num2);
}
	public void subNum(int num1,int num2) {
	System.out.println(num1-num2);
}
	public static void main(String[] args) {
	 Calculator operate=new Calculator();
	 operate.addNum(5, 7);
	 operate.subNum(7, 5);
	}

}
