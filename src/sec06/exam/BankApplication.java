package sec06.exam;

import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class BankApplication {

	private static Scanner scan = new Scanner(System.in);
	private static Bank[] BankArray = new Bank[100];

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------------------");
			System.out.print("����> ");

			int no = scan.nextInt();

			if (no == 1) {
				createAccount();
			} else if (no == 2) {
				accountList();
			} else if (no == 3) {
				deposit();
			} else if (no == 4) {
				withdraw();
			} else if (no == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		int i = 0;
		boolean run = true;
		
		for (int j = 0; j < 99; j++) {
			BankArray[i].getAno().equals(null);
		}
		
		do {
			BankArray[i] = new Bank("","",0);
//			if()
			System.out.println("----------");
			System.out.println("���»���");
			System.out.println("----------");
			System.out.println("");

//			���»���

			
//			���¹�ȣ
			System.out.print("���¹�ȣ: ");
			String ano = scan.next();
			BankArray[i].setAno(ano);
//			������
			System.out.print("������: ");
			String owner = scan.next();
			BankArray[i].setOwner(owner);
			
//			ù �Աݾ�
			System.out.print("�ʱ��Աݾ�: ");
			int balance = Integer.parseInt(scan.next());
			BankArray[i].setBalance(balance);
		} while (run);
		
//		System.out.println("���: ���°� �����Ǿ����ϴ�.");

	}

	private static void accountList() {

		System.out.println("----------");
		System.out.println("���¸��");
		System.out.println("----------");

		if (BankArray[0].getAno() == "123") {
			System.out.println("0o");
		}

	}

	private static void deposit() {
		System.out.println("-----");
		System.out.println("����");
		System.out.println("-----");
	}
	
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("���");
		System.out.println("-----");
	}

	private Bank findBankAno(String ano) {
		Bank myBank = new Bank("","",0);
		
		boolean run = true;
		int i = 0;
		
		do {
			if (myBank.getAno() == ano | i==99) {
				run = false;
			} else {
				i ++;
			}
		} while (run);

		return myBank;
	}
	
}
