package jeuxcodes;

import java.util.Scanner;

public class Mm2 {

	public static void main(String[] args) {
		
		int depOrdi = 3333;
        int compteur = 1;
        int codeSec = 0;
        int choixfdp = 0;
        boolean bon = false;
		
      //Rappel du type de jeu
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("                           MasterMind Défenseur");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("");
        
		do {
		
		Scanner sc1 = new Scanner(System.in);
		
		 	try{
				System.out.print("entrez votre code secret (4 chiffres entre 0 et 5) : ");
				codeSec = sc1.nextInt();
				
         }	catch(RuntimeException ex){
           		System.out.println("Les caractères sont interdits ! : ");
           		sc1.close();
         }
		 	String codeSecString = String.valueOf(codeSec);
		 	if(codeSecString.charAt(0) > 5 || codeSecString.charAt(1) > 5 || codeSecString.charAt(2) > 5 || codeSecString.charAt(3) > 5) {
		 		System.out.println("Mauvaise entrée... Veuillez saisir des chiffres compris entre 0 et 5." );
		 	}
		 	else if(codeSecString.charAt(0) <= 5 && codeSecString.charAt(1) <= 5 && codeSecString.charAt(2) <= 5 
		 			&& codeSecString.charAt(3) <= 5) {
		 		bon = true;
		 	}
		} while (bon == false);
		
		int m=(codeSec-codeSec%1000)/1000;
	    int c=(codeSec%1000-codeSec%100)/100;
	    int d=(codeSec%100-codeSec%10)/10;
	    int u=codeSec%10;
        
        int messai=(depOrdi-depOrdi%1000)/1000;
        int cessai=(depOrdi%1000-depOrdi%100)/100;
        int dessai=(depOrdi%100-depOrdi%10)/10;
        int uessai=depOrdi%10;
		
        /*do {
		
        	if (messai < m) {
			
        		System.out.println(" ");
        		System.out.println("messai = " + messai + "\nnb de coups : " + compteur);
        		messai++;
        		compteur++;
        		System.out.println("messai  augmente = " + messai + "\nnb de coups augmente: " + compteur);
        		System.out.println(" ");
			}
        	
        	else if (messai > m) {
        		
        		System.out.println(" ");
        		System.out.println("messai = " + messai + "\nnb de coups : " + compteur);
        		messai--;
        		compteur++;
        		System.out.println("messai  diminue = " + messai + "\nnb de coups augmente: " + compteur);
        		System.out.println(" ");
        	}
        
	} 	while (messai != m);
        
        do {
    		
    		if (cessai < c) {
    			compteur++;
    			System.out.println(" ");
    			System.out.println("cessai = " + cessai + "\nnb de coups : " + compteur);
    			cessai++;
    			compteur++;
    			System.out.println("cessai  augmente = " + cessai + "\nnb de coups : " + compteur);
    			System.out.println(" ");
    			}
            
    		else if (cessai > c) {
        		
        		System.out.println(" ");
        		System.out.println("cessai = " + cessai + "\nnb de coups : " + compteur);
        		cessai--;
        		compteur++;
        		System.out.println("cessai  diminue = " + cessai + "\nnb de coups augmente: " + compteur);
        		System.out.println(" ");
        	}
    		
    	} while (cessai != c);
        
        do {
    		
    		if (dessai < d) {
    			compteur++;
    			System.out.println(" ");
    			System.out.println("dessai = " + dessai + "\nnb de coups : " + compteur);
    			dessai++;
    			compteur++;
    			System.out.println("dessai  augmente = " + dessai + "\nnb de coups : " + compteur);
    			System.out.println(" ");
    			}
    		
    		else if (dessai > d) {
        		
        		System.out.println(" ");
        		System.out.println("dessai = " + dessai + "\nnb de coups : " + compteur);
        		dessai--;
        		compteur++;
        		System.out.println("dessai  diminue = " + dessai + "\nnb de coups augmente: " + compteur);
        		System.out.println(" ");
        	}
    		
    	} while (dessai != d);
        
        do {
		
		if (uessai < u) {
			compteur++;
			System.out.println(" ");
			System.out.println("uessai = " + uessai + "\nnb de coups : " + compteur);
			uessai++;
			compteur++;
			System.out.println("uessai  augmente = " + uessai + "\nnb de coups : " + compteur);
			System.out.println(" ");
			}
     
		else if (uessai > u) {
    		
    		System.out.println(" ");
    		System.out.println("uessai = " + uessai + "\nnb de coups : " + compteur);
    		uessai--;
    		compteur++;
    		System.out.println("uessai  diminue = " + uessai + "\nnb de coups augmente: " + compteur);
    		System.out.println(" ");
    	}
		
	} while (uessai != u);
 
        System.out.println("J'ai trouvé la réponse en " + compteur + " coups.");*/
        
        AlgoMm2 AlgoMm2 = new AlgoMm2(messai, m, compteur, cessai, c, dessai, d, uessai, u);	
        
      //Menu de fin de partie, appel de la class Fdp et passage du parametre "quelJeu"
		Fdp fdp = new Fdp(5);
            
}
}
		
		


