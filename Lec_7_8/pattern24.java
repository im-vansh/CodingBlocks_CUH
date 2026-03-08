

public class pattern24 {
    public static void main(String[] args) {
		int n = 5;// input
		int row = 1;
		int star = 1;
		int space = n - 1;

		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			int val = 1;
			while (j <= star) {
				System.out.print(val + " ");
				val++;
				j++;
			}

			// next line ki prep
			star = star + 2;
			space--;
			System.out.println();
			row++;
		}
	}
}
