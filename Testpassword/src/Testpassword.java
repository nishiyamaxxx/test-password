import java.util.Scanner;

public class Testpassword {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String str = in.nextLine();

		while (true) {
			if (str.equals("abc")) {
				System.out.println("おけまる");
				break;
			}
			System.out.println("何してんねん");
			str = in.nextLine();
		}
		
		System.out.println("おけ");
		in.close();
	}
}