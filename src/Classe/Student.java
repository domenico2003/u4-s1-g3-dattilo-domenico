package Classe;

public class Student {
	String name , surname ;
	char genere;
	double[] voti;
	
	public Student(String n, String s , char g ,double[] v) {
		this.name= n;
		this.surname= s;
		this.genere=g;
		this.voti=v;
	}
	
	public  double  media () {
		double mediaVoti= 0;
		for (int i = 0 ;i< this.voti.length ; i++) {
			mediaVoti += this.voti[i];
		}
		
		return mediaVoti /this.voti.length ;
	} 
	
	public static Student mBest (Student[] studenti) {
		Student bestStudent = null;
		
		for (int i = 0 ;i< studenti.length ; i++) {
			
			if(studenti[i].genere == 'M' && studenti[i].media() > bestStudent.media()) {
				bestStudent= studenti[i];
			}
		}
		
		return bestStudent;
	}
	;
}
//calcolare studente migliore della classe prima maschio poi femmina e poi il migliore in assoluto