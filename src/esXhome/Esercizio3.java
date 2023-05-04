package esXhome;

import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String parola ="";
		
       while (!parola.equals(":q")) {
    	   	System.out.print("inserisci una stringa(inserisci \":q\" per uscire): ");
    	   	parola = in.nextLine()
    	   			;
    	    
    	    
    	    if(!parola.equals(":q")) {
	    	    	System.out.print("Caratteri");
		    	    for(int i = 0 ; i < parola.length();i++) {
		    	    	if(i == parola.length()-1) {
		    	    		System.out.print(" "+ parola.charAt(i)+".");
		    	    	}else {
		    	    		System.out.print(" "+ parola.charAt(i)+ ",");}
		    	    }
	    	    }
    	    System.out.println();
       };
       
       System.out.println("programma concluso");
       
		in.close();
	}
}
