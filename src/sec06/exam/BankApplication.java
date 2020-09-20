package sec06.exam;

import java.util.Scanner;

public class BankApplication {

	private static Scanner scan = new Scanner(System.in);
	private static Bank[] BankArray = new Bank[100];

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택> ");

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
		System.out.println("프로그램 종료");
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
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.println("");

		System.out.print("계좌번호: ");
		String ano = scan.next();
		BankArray[0].setAno(ano);
		System.out.println(BankArray[0].getAno());
//		String a = BankArray[0].getAno();
//		System.out.println(a);
//		BankArray[].setAno(ano);
//		System.out.println("AAA " + ano);

//		System.out.print("계좌주: ");
//		String owner = scan.next();
//		System.out.println(owner);
//		System.out.print("초기입금액: ");
//		int balance = Integer.parseInt(scan.next());
//		System.out.println("결과: 계좌가 생성되었습니다.");

	}

	private static void accountList() {

		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");

		if (BankArray[0].getAno() == "123") {
			System.out.println("0o");
		}

	}

//	private static void deposit() {
//		System.out.println("-----");
//		System.out.println("예금");
//		System.out.println("-----");
//	}
//	
//	private static void withdraw() {
//		System.out.println("-----");
//		System.out.println("출금");
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
