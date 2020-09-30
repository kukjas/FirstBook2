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

			// �Լ�����
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
		// �迭 index
		int i = 0;
		// �Աݰ��ɿ���
		boolean run;

		// �迭 index üũ
		for (int j = 0; j < 100; j++) {
			if (BankArray[i] != null) {
				i = j;
			}
		}

		// ���
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		System.out.println("");

		// ���»���
		BankArray[i] = new Bank("", "", 0);

		// ���¹�ȣ �Է�
		System.out.print("���¹�ȣ: ");
		String ano = scan.next();

		// ������ ���¹�ȣ ��ȸ
		for (int j = 0; j < i; j++) {
			//			 System.out.print("���� �����ϴ� ���� : BankArray[" + j + "] =" +BankArray[j].getAno() + "/" + BankArray[j].getOwner());

			if (ano.equals(BankArray[j].getAno())) {
				System.out.println("�ش���� ��ȣ�� �̹� �����մϴ�. �ٸ����� ��ȣ�� �������ֽʽÿ�.");
				BankArray[(i)] = null;
				main(null);
			}
		}

		// ���¹�ȣ ����üũ
		try {
			int temp = Integer.parseInt(ano);
			BankArray[i].setAno(ano);
		} catch (Exception NumberFormatException) {
			BankArray[i] = null;
			System.out.println("���¹�ȣ�� ���ڷ� �Է����ֽʽÿ�");
			main(null);
		}

		// ������ �Է�
		System.out.print("������: ");
		String owner = scan.next();
		BankArray[i].setOwner(owner);

		// ù �Աݾ�
		System.out.print("�ʱ��Աݾ�: ");
		int balance = 0;

		// �Աݾ� int üũ �� �Է�
		try {
			balance = Integer.parseInt(scan.next());
			BankArray[i].setBalance(balance);
		} catch (Exception NumberFormatException) {
			BankArray[i] = null;
			System.out.println("���¹�ȣ�� ���ڷ� �Է����ֽʽÿ�");
			main(null);
		}
	}

	// ���� ��� ���
	private static void accountList() {

		int i = 0;

		// ���
		System.out.println("----------");
		System.out.println("���¸��");
		System.out.println("----------");

		// ���� ��� ���
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

		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		ano = scan.next();
		//		���³ѹ� ���� ������ȸ
		try {
			int j = Integer.parseInt(ano);
		} catch (Exception numberException) {
			System.out.println("���¹�ȣ�� ���ڷ� �Է��ϼ���");
			main(null);
		}
		
		//ano�� ���¹�ȣ�� ��� �ش� ���´� ����
		myBank = findBankAno(ano);
		
		// �׷��� ""�� ���¹�ȣ�ų� ���¹�ȣ ���� ���� �ϳ��� ���� ��� ����
		//���°� ���� ������ ��ȸ, ���´� 100���� �����Ǳ⿡ ���� ������ �ʿ� ����
		while (BankArray[i] != null) {
			if (BankArray[i].getAno().equals(ano)) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}

		//		���°���
		System.out.println("�߰��Աݾ� �Է� �ٶ��ϴ�.");
		String temp = scan.nextLine();

		//		�Աݾ� ���� ���� ��ȸ
		try {
			credit= Integer.parseInt(temp);
		} catch (Exception NeumberFormatException) {	
			System.out.println("�߰��Աݾ��� ���ڷ� �Է����ֽʽÿ�.");
			main(null);
		}
		System.out.println("���� ������: " + myBank.getBalance());
		System.out.println("�Աݰ��: " + (myBank.getBalance() + credit));
	}

	private static void withdraw() {

		System.out.println("");
	}

	private static Bank findBankAno(String ano) {
		// ���� ����
		int i = 0;
		Bank myBank = new Bank("", "", 0);

		// �迭 ��ȸ
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
	//	private �Լ� ��

}
