import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b, serie, i;
		System.out.println("Digite o tamanho da serie:");
		int tamanho = sc.nextInt();
		sc.close();
		a=0;
		b=1;
		System.out.println("Serie de fibonacci:");
		System.out.println("0");
		for(i=0; i<=tamanho; i++) {
			serie = a+b;
			a=b;
			b=serie;
			System.out.println(a);
		}
		
	}
 
}
