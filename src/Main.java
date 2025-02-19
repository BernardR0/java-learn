import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		int n = 1;
		System.out.println("Digite o numero de repetiçoes:");
		int r = sc.nextInt();
		
		for(i=1; i<=r; i++) {
        System.out.printf("%d Hello World!%n", n++);
        
        sc.close();
		}
	}

}
