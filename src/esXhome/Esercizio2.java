package esXhome;

public class Esercizio2 {
	public static void main(String[] args) {
	//numberToString(0);
	//numberToString(1);
	//numberToString(2);
	//numberToString(3);
	//numberToString(4);
	}
	
	public static void numberToString (int number) {
		switch (number) {
		case 0: {
			System.out.println("zero");
			break;
		}
		case 1: {
			System.out.println("uno");	
			break;
		}
		case 2: {
			System.out.println("due");
			break;
		}
		case 3: {
			System.out.println("tre");
			break;
		}
		default:
			System.out.println("Il " + number +  " non é compreso tra  0 e  3;" );
		}
	}
}
