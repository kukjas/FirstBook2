package sec06._15_04;

import java.lang.reflect.Method;

public class PrintAnnotationExam {
	public static void main(String[] args) {
		//Service Ŭ�����κ��� ���� ����
		Method[] declaredMetods = Service.class.getDeclaredMethods();
		
		//Method ��ü�� �ϳ��� ó��
		for (Method method : declaredMetods) {
			
			//PrintAnnotation�� ����Ǿ����� Ȯ��
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation ��ü ���
				PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.print("[ " + method.getName() + " ]");
				//���м� ���
				for (int i = 0; i < printAnno.number(); i++) {
					System.out.print(printAnno.value());
				}
				try {
					method.invoke(new Service());
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}
}
