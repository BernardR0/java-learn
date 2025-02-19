
import java.io.IOException;
import java.util.Scanner;

public class beecrowd1065 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int i, n;
		int pares = 0;
		
		
		for(i=0;i<5;i++)
		{
			n = leitor.nextInt();
			if(n%2==0) pares++;
		}
		System.out.println(pares + " valores pares");
		leitor.close();
	}

}
