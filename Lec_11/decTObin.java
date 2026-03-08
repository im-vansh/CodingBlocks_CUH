package Lec_11;

public class decTObin {
    public static void main(String[] args) {
		int n = 172;
		int mul = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 2;
			sum = sum + rem * mul;
			n = n / 2;
			mul = mul * 10;
		}
		System.out.println(sum);
	}

}
