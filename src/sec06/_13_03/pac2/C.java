package sec06._13_03.pac2;

import sec06._13_03.pac1.A;

public class C {
	
	public C() {
		
	A a = new A();
	
	a.field1 = 1;
//	a.field2 = 1;		->default �Ұ�(�ٸ� ��Ű��)
//	a.field3 = 1;		->private�� �Ұ�
	
	a.method1();
//	a.method2();		->default �Ұ�(�ٸ� ��Ű��)
//	a.method3();		->private�� �Ұ�
	}
}
