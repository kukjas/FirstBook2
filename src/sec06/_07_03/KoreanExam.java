package sec06._07_03;

public class KoreanExam {
	public static void main(String[] args) {
		Korean k1 = new Korean("��μ�", "12345");
		System.out.println(k1.name + "�� �ֹι�ȣ�� " + k1.ssn);
		
		Korean k2 = new Korean("�̹μ�", "23456");
		System.out.println(k2.name + "�� �ֹι�ȣ�� " + k2.ssn);
	}
}