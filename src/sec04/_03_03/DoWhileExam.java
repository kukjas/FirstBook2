package sec04._03_03;

import java.util.Scanner;

public class DoWhileExam {
	public static void main(String[] args) {
		System.out.println("input");
		System.out.println("�����ϰ� ������ q");
		
		Scanner scanner = new Scanner(System.in);
		String inputString = "";
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			if (!inputString.equals("q")) {
				System.out.println(inputString +" �Է��� �ȵ�~~");
			}
		} while (! inputString.equals("q"));
		
		System.out.println("q�ϱ� 1�� ����!!");
		
		Scanner scanner2 = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println("q �� ����~~");
			if (inputString.equals("q")) {
				System.out.println("����!!");
				run = false;
			}
		}
	}
}
