package esXhome;

public class Esercizio1 {
	public static void main(String[] args) {
	//System.out.println( stringaPariDispari("tre"));
	//System.out.println( stringaPariDispari("io"));

	//System.out.println( annoBisestile(2024)); //divisibile per 4
	//System.out.println( annoBisestile(2023)); //non divisibile nè per 4 nè per 100 nè per 400
	System.out.println( annoBisestile(1700)); //divisibile per 100 e 400
	}
	
	public static boolean stringaPariDispari(String x) {
		if (x.length()%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean annoBisestile(int x) {
		if (x%4 == 0 && x%100 != 0) {
			return true;
		} else if(x%400 == 0) {
			return true;
		}else {
			return false;
		}
	
}
}
