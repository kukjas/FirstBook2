package sec07._07_01;

public class ChildExam {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		
//		오버라이드 안된 메소드 호출 불가
//		parent.method3();
	}
}
