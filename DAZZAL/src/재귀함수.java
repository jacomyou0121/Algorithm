
public class ����Լ� {
	 void re(int a) { //n : 5
		if (a==0) {
			System.out.println(a);
			return;
		}
		System.out.println(a+"���̿�");
		re(a-1);
		System.out.println(a+"����");
		
		
	}
	public static void main(String[] args) {
		����Լ� b = new ����Լ�();
		b.re(5);
	}
}
