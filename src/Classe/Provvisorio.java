package Classe;
import java.util.ArrayList;

public class Provvisorio {

	public static void main(String[] args) {
		
		double[] array1= {9.5,9.8,10,7,7,9,10};
		double[] array2= {6,7,9,7,7,8,9};
		double[] array3= {7,7.8,7,6,5,6,10};
		double[] array4= {4.5,10,10,7,8,9,10};
		double[] array5= {3,2,5,5,4,3,6};
		double[] array6= {10,10,10,9,9,8,7};
		
		Student studente1 = new Student("Domenico","Dattilo",'M',array1);
		Student studente2 = new Student("Studente2","Viola",'F',array2);
		Student studente3 = new Student("Studente3","Rossi",'M',array3);
		Student studente4 = new Student("Studente4","Gialli",'F',array4);
		Student studente5 = new Student("Studente5","Verdi",'M',array5);
		Student studente6 = new Student("Studente6","Blu",'F',array6);
		
		Student[] studenti = {studente1,studente2,studente3,studente4,studente5,studente6};
		
		Student fMigliore=Student.fBest(studenti);
		Student mMigliore=Student.mBest(studenti);
		Student ilMigliore=Student.theBest(studenti);
		
		System.out.println(fMigliore.toString());
		System.out.println(mMigliore.toString());
		System.out.println(ilMigliore.toString());
		
		;

	}

}
