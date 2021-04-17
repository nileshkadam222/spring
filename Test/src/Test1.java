import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] a = { 2, 5, 6, 7, 8 };
		int b = 7;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = a[i] + a[i + 1];
			if (sum == b) {
			}
		}
	}

}
