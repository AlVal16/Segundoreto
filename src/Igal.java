import java.util.Scanner;
public class Igal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b; 
		
		Scanner scan=new Scanner (System.in);
		 System.out.println("Escribir primer n�mero");
		 a=scan.nextInt();
		 System.out.println("Escribir segundo n�mero");
		b=scan.nextInt();
		 if(a==b) {
				//verdadera
				System.out.println("N�mero igual");
			         }
			
			else {
				System.out.println("N�mero diferente");
			}
				
		
		
	}

}
