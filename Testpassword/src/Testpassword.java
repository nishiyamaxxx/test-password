import java.util.Scanner;

public class Testpassword {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�p�X���[�h����͂��Ă�������");
		String str = in.nextLine();

		while (true) {
			if (str.equals("abc")) {
				System.out.println("�����܂�");
				break;
			}
			System.out.println("�����Ă�˂�");
			str = in.nextLine();
		}
		
		System.out.println("����");
		in.close();
	}
}