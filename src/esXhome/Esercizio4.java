package esXhome;


import java.util.Scanner;

public class Esercizio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("inserisci un numero per far partire il conto alla rovescia");
		int numero =in.nextInt();
		
		if(numero <= 0) {
			System.out.println("!Devi inserire un numero superiore a 0!");
		}else {
			for (int i = numero-1 ; i != -1; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(i == 0) {
					System.out.println("BOOM!!!" );
				}else {
				System.out.println(i);
				}
				
			}
		}
		
		in.close();
		
		
	}
	
	
}
