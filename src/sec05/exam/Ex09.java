package sec05.exam;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("------------------------------------------------------");
			System.out.print("����>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("�л���>: ");
				studentNum = scanner.nextInt();
				run = true;
			} else if(selectNo == 2){
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
				System.out.print("����" + i+" >: ");
					//�����Է��� ������
				scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3){
				for (int i = 0; i < scores.length; i++) {
					System.out.println("����" + (i+1)+" >: " + scores[i]);
				}
			} else if(selectNo == 4){

//				�ִ밪�� 
				int max = 0; double avg = 0.0; int sum = 0;
				
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i]; 
					}
				}
				
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				System.out.println(sum);
				avg = sum / studentNum;
				
				System.out.println("�ְ�����: " + max);
				System.out.println("���: " + avg);
			
			} else if(selectNo == 5){
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
}
