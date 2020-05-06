import java.util.Scanner;
public class Igal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b; 
		
		Scanner scan=new Scanner (System.in);
		 System.out.println("Escribir primer número");
		 a=scan.nextInt();
		 System.out.println("Escribir segundo número");
		b=scan.nextInt();
		 if(a==b) {
				//verdadera
				System.out.println("Número igual");
			         }
			
			else {
				System.out.println("Número diferente");
			}
				
		
		
	}

}
