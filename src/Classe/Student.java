package Classe;

import java.util.Arrays;

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
		double mediaMigliore=0.0;
		Student bestStudent = null;
		Student s = null;
		
		for (int i = 0 ;i< studenti.length ; i++) {
			s = studenti[i];
			if(studenti[i].genere == 'M' && s.media() >mediaMigliore) {
				mediaMigliore=s.media();
				bestStudent= s;
			}
		}
		
		return bestStudent;
	}
	public static Student fBest (Student[] studenti) {
		double mediaMigliore=0.0;
		Student bestStudent = null;
		Student s = null;
		
		for (int i = 0 ;i< studenti.length ; i++) {
			s = studenti[i];
			if(studenti[i].genere == 'F' && s.media() >mediaMigliore) {
				mediaMigliore=s.media();
				bestStudent= s;
			}
		}
		
		return bestStudent;
	}
	public static Student theBest (Student[] studenti) {
		double mediaMigliore=0.0;
		Student bestStudent = null;
		Student s = null;
		for (int i = 0 ;i< studenti.length ; i++) {
			s = studenti[i];
			if(s.media() >mediaMigliore) {
				 mediaMigliore=s.media();
				bestStudent= s;
			}
		}
		
		return bestStudent;
	}
	
	@Override
	public String toString () {
		return "{ name: "+this.name+"; surname: "+this.surname+"; genere: "+ this.genere +"; voti: "+ Arrays.toString(this.voti)+"}";
	}
	;
}
//calcolare studente migliore della classe prima maschio poi femmina e poi il migliore in assoluto