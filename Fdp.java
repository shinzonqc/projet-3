package jeuxcodes;

import java.util.Scanner;

public class Fdp {
	//Stocke le choix de fin de partie
	public int choixFdp;
	/*public int quelJeu;*/
	
	
	 //Menu de fin de partie
	public Fdp (int quelJeu) {
	
		do {
		
		System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        System.out.println("**                                                                       **");
        System.out.println("**                                                                       **");
        System.out.println("**                                                                       **");
        System.out.println("**                          1 - Rejouer                                  **");
        System.out.println("**                                                                       **");
        System.out.println("**                          2 - Changer de jeux                          **");
        System.out.println("**                                                                       **");
        System.out.println("**                          3 - Quitter                                  **");
        System.out.println("**                                                                       **");
        System.out.println("**                                                                       **");
        System.out.println("**                                                                       **");
        System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        
        Scanner fdp = new Scanner(System.in);
        
        try{
        	System.out.print("                       Faite votre choix (1, 2 ou 3) : ");
        choixFdp = fdp.nextInt();
        
        //Gère si saisie de caractères
        }catch(RuntimeException ex){
            System.out.println("Les caractères sont interdits ! Faite votre choix (1, 2 ou 3)... "); }
       
        //gère si choix de chiffres différents de ceux possibles
    } while (choixFdp != 1 && choixFdp != 2 && choixFdp != 3);

		//gère les choix du menu Fdp
	    if (choixFdp == 1 && quelJeu == 1) {
	    	
	        Cs.main(new String[0]); }
	    
	    else if (choixFdp == 1 && quelJeu == 2) {
	    	
            Csdef.main(new String[0]); }
	    
	    else if (choixFdp == 1 && quelJeu == 3) {
	    	
            Csduel.main(new String[0]); }
	    
	    else if (choixFdp == 1 && quelJeu == 4) {
	    	
            Mm.main(new String[0]); }
	    
	    else if (choixFdp == 1 && quelJeu == 5) {
	    	
            Mm2.main(new String[0]); }
	    
	    else if (choixFdp == 1 && quelJeu == 6) {
	    	
            Mm3.main(new String[0]); }
	    	
	    if (choixFdp == 2) {

	        try {
	            Menu.main(new String[0]); }
	    	catch (Exception e) {
	            e.printStackTrace(); }
	    }
	    if (choixFdp == 3) {

	        System.exit(1); }
	  }


	 
}
	
	
	