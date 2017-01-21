package java_basics;

public class DiamondPattern {

	public static void diamondPattern(int number) {


		int k = number + 1;
		for (int i = k; i > 0; i--) {

			for (int j = 0; j <= i; j++) {

				int count = k - j;
				if (j == (i - 1)) {
					for (int j2 = 0; j2 < count; j2++) {
						System.out.print(j2);
					}
					for (int k2 = count - 2; k2 >= 0; k2--) {
						System.out.print(k2);

					}
				}
				if (j == 0 || j == i) {

					{
						for (int l = 1; l < i ; l++) {
							System.out.print("-");
						}

					}

				}
			}
			System.out.print("\n");
			
		}

		int p1 = number;
		for (int i = p1; i > 0; i--) {

			for (int j = i; j >= 0; j--) {

				int count = i;
				if (j == (i - 1)) {
					for (int j2 = 0; j2 < count; j2++) {
						System.out.print(j2);
					}
					for (int k2 = count - 2; k2 >= 0; k2--) {
						System.out.print(k2);

					}
				}
				if (j == i || j == 0) {

					{
						for (int l = 0; l <= number - i; l++) {
							System.out.print("-");
						}

					}

				}
			}
			System.out.print("\n");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiamondPattern.diamondPattern(5);

	}

}
