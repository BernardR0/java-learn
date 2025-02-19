import java.util.Scanner;
import java.io.IOException;

public class beecrowd1072 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int n, i;
		n = leitor.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==0) {
			System.out.printf("%d^2 = %.0f\n", i, Math.pow(i, 2));
			}
		}
		
		leitor.close();
		
	}

}
