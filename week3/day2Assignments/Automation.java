package week3.day2Assignments;

public class Automation extends MultipleLanguage{

	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.python();
		obj.ruby();
		obj.selenium();
		obj.java();
	}

	public void selenium() {
		System.out.println("Selenium from TestTool Interface");
		
	}

	public void java() {
		System.out.println("Java from Language Interface");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby from unimplemented MultipleLanguage abstract class");
		
	}

}
