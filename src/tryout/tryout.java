package tryout;

public class tryout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char teken = 'a';
		int getal = 7;
		for (int k = 2; k < 8; k = k + 2) {
			if (k % 3 == 1 || getal-- == 7) {
				System.out.println(teken++ + "\t" + getal);
			}
		}
	}

}
