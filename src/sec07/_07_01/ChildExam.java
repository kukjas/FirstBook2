package sec07._07_01;

public class ChildExam {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		
//		�������̵� �ȵ� �޼ҵ� ȣ�� �Ұ�
//		parent.method3();
	}
}
