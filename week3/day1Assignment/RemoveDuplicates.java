package week3.day1Assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text ="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] text1 = text.split(" ");
		System.out.println(text1[1]);
		for(int i =0 ;i<text1.length;i++) {
			for(int j = i+1;j < text1.length;j++) {
				if(text1[i].equals(text1[j])) {
					text1[j]="";
					count++;
				}
			}
		}
		if(count>1) {
			for(int k=0;k < text1.length ;k++) {
				System.out.print(text1[k]+" ");
			}
		}
		
	}

}
