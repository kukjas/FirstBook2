package sec06._15_04;

public class Service {
	@PrintAnnotation(value = "d", number = 3)
	public void method1() {
		System.out.print("���� ����1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.print("���� ����2");
	}
	
	@PrintAnnotation(value = "d", number = 12)
	public void method3() {
		System.out.print("���� ����3");
	}
	
}
