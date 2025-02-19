import java.io.IOException;
import java.util.Scanner;

public class beecrowd1078 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int n, i, multi;
    	n = sc.nextInt();
    	sc.close();
    	for(i=1;i<=10;i++) {
    		multi=i*n;
    		System.out.printf("%d x %d = %d\n", i, n, multi);
    	}
    	
    }
}
