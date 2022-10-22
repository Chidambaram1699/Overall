package week1day1.assignments;

public class Mobile {
	public void mobileModel() {
	String mobilemodel="VIVO Z1 PRO";
	float mobileweight= 120.32f;
	System.out.println(mobilemodel);
	System.out.println(mobileweight);
	}
	public void makeCall() {
	boolean isfullycharged=true;
	int mobilecost = 14000;
	System.out.println(isfullycharged);
	System.out.println(mobilecost);
	
	System.out.println("Ringing");	
	}
	public void sendMessage() {
	System.out.println("Message sent");

	}
	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMessage();
		obj.mobileModel();
		

	}

}
