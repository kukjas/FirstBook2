package sec05._05_05;

public class StringEqualsExam {
	public static void main(String[] args) {
		String strVar1 = "�Ź�";
		String strVar2 = "�Ź�";
		
		if (strVar1 == strVar2) {
			System.out.println("����");			
		}else {
			System.out.println("�ٸ�");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("����");			
		}

		String strVar3 = new String("�Ź�");
		String strVar4 = new String("�Ź�");
		
		if (strVar3 == strVar4) {
			System.out.println("����");			
		}else {
			System.out.println("�ٸ�");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("����");			
		}
	}
}
