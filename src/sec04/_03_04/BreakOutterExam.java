package sec04._03_04;

public class BreakOutterExam {
	public static void main(String[] args) {
		Outter: for (char upper='A'; upper<='Z'; upper++) {
			for (char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + " - " +lower);
				if (lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("��ü����");
	}
}
