package sec06.exam;

import java.util.Scanner;

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
//				deposit();
			} else if (no == 4) {
//				withdraw();
			} else if (no == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {

//		boolean run = true;
//		int i = 0;
//		do {
//			BankArray[i].setAno("");
//			BankArray[i].setOwner("");
//			BankArray[i].setBalance(0);
//			if (i ==99) {
//				run =false;
//			}
//		}while(run);

		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		System.out.println("");

		System.out.print("���¹�ȣ: ");
		String ano = scan.next();
		BankArray[0].setAno(ano);
		System.out.println(BankArray[0].getAno());
//		String a = BankArray[0].getAno();
//		System.out.println(a);
//		BankArray[].setAno(ano);
//		System.out.println("AAA " + ano);

//		System.out.print("������: ");
//		String owner = scan.next();
//		System.out.println(owner);
//		System.out.print("�ʱ��Աݾ�: ");
//		int balance = Integer.parseInt(scan.next());
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

//	private static void deposit() {
//		System.out.println("-----");
//		System.out.println("����");
//		System.out.println("-----");
//	}
//	
//	private static void withdraw() {
//		System.out.println("-----");
//		System.out.println("���");
//		System.out.println("-----");
//	}

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

//	private static Bank findBankAno(String ano) {
//		
//		String bankAno;
//		Bank mybank = new Bank(null, null, 0);
//		boolean run = true;
//		int i = 0;
//		
//		 do{
//				 if(BankArray[i].getAno() == ano){
//					 run = false;
//					 mybank.setAno();
//				 }else {
//					 i++;
//				 }
//				
//			}while(run);

//		Bank mybank = new Bank(ano, null, 0);
//		if(ano.equals(bankAno)==false) {
//			mybank.setAno();
//		}
//				
//		return null;
//		}
}
