package jeuxcodes;

import java.util.Scanner;

public class Mm2 {

	public static void main(String[] args) {
		
		int depOrdi = 3333;
        int compteur = 1;
        int codeSec = 0;
        
        
		
      //Rappel du type de jeu
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("                           MasterMind Défenseur");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("");
        
		do {
		
		Scanner sc1 = new Scanner(System.in);
		
		 	try{
				System.out.print("entrez votre code secret (4 chiffres entre 1 et 6) : ");
				codeSec = sc1.nextInt();
				
         }	catch(RuntimeException ex){
           		System.out.println("Les caractères sont interdits ! : ");}
		 	
		 	} while (codeSec > 6666 || codeSec < 1111);
		 	
		
		int m=(codeSec-codeSec%1000)/1000;
	    int c=(codeSec%1000-codeSec%100)/100;
	    int d=(codeSec%100-codeSec%10)/10;
	    int u=codeSec%10;
        
        int messai=(depOrdi-depOrdi%1000)/1000;
        int cessai=(depOrdi%1000-depOrdi%100)/100;
        int dessai=(depOrdi%100-depOrdi%10)/10;
        int uessai=depOrdi%10;
		
       
        
        AlgoMm2 AlgoMm2 = new AlgoMm2(messai, m, compteur, cessai, c, dessai, d, uessai, u);	
        
      //Menu de fin de partie, appel de la class Fdp et passage du parametre "quelJeu"
		Fdp fdp = new Fdp(5);
            
}
}
		
		


