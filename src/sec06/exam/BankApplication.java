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

			// 함수선택
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
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		// 배열 index
		int i = 0;
		// 입금가능여부
		boolean run;

		// 배열 index 체크
		for (int j = 0; j < 100; j++) {
			if (BankArray[i] != null) {
				i = j;
			}
		}

		// 출력
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.println("");

		// 계좌생성
		BankArray[i] = new Bank("", "", 0);

		// 계좌번호 입력
		System.out.print("계좌번호: ");
		String ano = scan.next();

		// 동일한 계좌번호 조회
		for (int j = 0; j < i; j++) {
			//			 System.out.print("현재 존재하는 계좌 : BankArray[" + j + "] =" +BankArray[j].getAno() + "/" + BankArray[j].getOwner());

			if (ano.equals(BankArray[j].getAno())) {
				System.out.println("해당계좌 번호는 이미 존재합니다. 다른계좌 번호를 선택해주십시오.");
				BankArray[(i)] = null;
				main(null);
			}
		}

		// 계좌번호 숫자체크
		try {
			int temp = Integer.parseInt(ano);
			BankArray[i].setAno(ano);
		} catch (Exception NumberFormatException) {
			BankArray[i] = null;
			System.out.println("계좌번호는 숫자로 입력해주십시오");
			main(null);
		}

		// 계좌주 입력
		System.out.print("계좌주: ");
		String owner = scan.next();
		BankArray[i].setOwner(owner);

		// 첫 입금액
		System.out.print("초기입금액: ");
		int balance = 0;

		// 입금액 int 체크 후 입력
		try {
			balance = Integer.parseInt(scan.next());
			BankArray[i].setBalance(balance);
		} catch (Exception NumberFormatException) {
			BankArray[i] = null;
			System.out.println("계좌번호는 숫자로 입력해주십시오");
			main(null);
		}
	}

	// 계좌 목록 출력
	private static void accountList() {

		int i = 0;

		// 출력
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");

		// 실제 목록 출력
		while (BankArray[i] != null) {
			System.out.println(
					BankArray[i].getAno() + "		" + BankArray[i].getOwner() + "		" + BankArray[i].getBalance());
			if (i == 99) {
				break;
			} else {
				i++;
			}
		}
	}

	private static void deposit() {

		int i = 0;
		boolean run = true;
		String ano = "";
		int credit = 0;
		Bank myBank =  new Bank("", "", 0);

		System.out.print("계좌번호를 입력하세요: ");
		ano = scan.next();
		//		계좌넘버 숫자 오류조회
		try {
			int j = Integer.parseInt(ano);
		} catch (Exception numberException) {
			System.out.println("계좌번호를 숫자로 입력하세요");
			main(null);
		}
		
		//ano가 계좌번호인 경우 해당 계좌는 계좌
		myBank = findBankAno(ano);
		
		// 그러나 ""가 계좌번호거나 계좌번호 같은 것이 하나도 없는 경우 에러
		//계좌가 없는 곳까지 조회, 계좌는 100개만 생성되기에 숫자 제한은 필요 없음
		while (BankArray[i] != null) {
			if (BankArray[i].getAno().equals(ano)) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}

		//		계좌관리
		System.out.println("추가입금액 입력 바랍니다.");
		String temp = scan.nextLine();

		//		입금액 숫자 오류 조회
		try {
			credit= Integer.parseInt(temp);
		} catch (Exception NeumberFormatException) {	
			System.out.println("추가입금액은 숫자로 입력해주십시오.");
			main(null);
		}
		System.out.println("본래 소유액: " + myBank.getBalance());
		System.out.println("입금결과: " + (myBank.getBalance() + credit));
	}

	private static void withdraw() {

		System.out.println("");
	}

	private static Bank findBankAno(String ano) {
		// 변수 생성
		int i = 0;
		Bank myBank = new Bank("", "", 0);

		// 배열 조회
		while (BankArray[i] != null) {
			if (i == 100) {
				break;
			}else if (BankArray[i].getAno().equals(ano)) {
				myBank = BankArray[i];
				break;
			} else {
				i++;
			}
		}
		return myBank;
	}
	//	private 함수 끝

}
