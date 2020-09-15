package sec06.exam;

//import java.util.Scanner;

public class Printer {
	 
//	Scanner scan = new Scanner(System.in);
//	Printer printer = new Printer();
	
//	public String outCom() {
//
//		String arrange = "dq";
//		int i = 0;
//		boolean fact = true;
//		String temp;
//		
//		 do{
//			i++;
//			temp = scan.next();
//			if (temp == null) {
//				fact = false;
//			}else {
//				System.out.println(temp);
//			}
//		}while (fact);
//		
//		 
//		return arrange;
//	}
	
	public void outCom(int num) {
		System.out.println(num);
	}
	
	public void outCom(boolean fact) {
		System.out.println(fact);
	}
	
	public void outCom(double ration) {
		System.out.println(ration);
	}
	
	public void outCom(String text) {
		System.out.println(text);
	}
}
