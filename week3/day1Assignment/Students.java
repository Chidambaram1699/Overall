package week3.day1Assignment;

public class Students {
	public void getStudentsInfo(int id){
		System.out.println("Id is "+ id);
	}
	public void getStudentsInfo(int id ,String name){
		System.out.println("Id id "+id+" & Name is "+name);
	}
	public void getStudentsInfo(String email,long phno){
		System.out.println("Email is "+email+" & Phone Number is "+phno);
	}

	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentsInfo(13579);
		obj.getStudentsInfo(13579, "Chidambaram");
		obj.getStudentsInfo("chidambarammdc@gmail.com", 9876543210L);
	}

}
