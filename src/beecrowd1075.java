import java.io.IOException;
import java.util.Scanner;

public class beecrowd1075 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		 for(i=0;i<10000;i++) {
			 if(i%n==2) {
				 System.out.println(i);
			 }
		 }

	}

}
