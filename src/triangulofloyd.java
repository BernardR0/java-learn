import java.util.Scanner;

public class triangulofloyd {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   int n, i, j, linhas;
    	   System.out.println("Quantas linhas voce quer?");
    	   linhas = sc.nextInt();
    	   sc.close();
    	   n = 1;
    	   
    	   for(i=0;i<=linhas; i++) {
    		   for(j=1;j<=i;j++) {
    			   System.out.printf("%d ", n);
    			   n++;
    		   }
    		   System.out.println();
    	   }
    	   
       }
}
