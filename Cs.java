package jeuxcodes;

import java.io.*;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Cs {

    public static void main(String[] args)  {

        //Création variables
        int nbadev = 0;
        int essai = 0;
        int compteur = 0;
        int bon2 = 0;
        boolean toutBon = false;
        int [] nbMax = {99, 999, 9999};
        String rand = "";
		String rand2 = "";
		String rand3 = "";
		String rand4 = "";
		String combinaison = "";
        
      //Rappel du type de jeu
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("                            Code Secret Challenger");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("");
        
        //Accéder au fichier de configuration externe
        File configFile = new File("config.properties");

        try {
            FileReader reader = new FileReader(configFile);
            Properties props = new Properties();
            props.load(reader);

            //Appel des paramètres du fichier config et stockage dans des strings
            String host = props.getProperty("CoupMaxCs");
            String md = props.getProperty("modeDev");
            String nbCases = props.getProperty("NbCaseCS");

            //Impression à l'écran du nbre de coups max définis dans le fichier config
            System.out.println("Nombre de coups max : " + host);
            //System.out.println("");
            
            // Convertir le string host en int en le transferant dans l'int nbcpmxcs2
            int nbcpmxcs = Integer.parseInt(host);
            int nbCaseInt = Integer.parseInt(nbCases);
            
            // Génération aléatoire d'un nombre à x chiffres (NbCases)
            String[] tab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    		Random r=new Random();
    		
    		
    		if (nbCaseInt == 2) {	
    		
            int randomNumber1=r.nextInt(tab.length);
            int randomNumber2=r.nextInt(tab.length);
            rand = (tab[randomNumber1]);
            rand2 = (tab[randomNumber2]);}
    		
    		else if (nbCaseInt == 3) {	
    			
    	        int randomNumber1=r.nextInt(tab.length);
    	        int randomNumber2=r.nextInt(tab.length);
    	        int randomNumber3=r.nextInt(tab.length);
    	        rand = (tab[randomNumber1]);
    	        rand2 = (tab[randomNumber2]);
    	        rand3 = (tab[randomNumber3]);}
    		
    		else if (nbCaseInt == 4) {	
    			
    	        int randomNumber1=r.nextInt(tab.length);
    	        int randomNumber2=r.nextInt(tab.length);
    	        int randomNumber3=r.nextInt(tab.length);
    	        int randomNumber4=r.nextInt(tab.length);
    	        rand = (tab[randomNumber1]);
    	        rand2 = (tab[randomNumber2]);
    	        rand3 = (tab[randomNumber3]);
    	        rand4 = (tab[randomNumber4]);}
            
            
            
            /*if (nbCaseInt == 2) {
            	nbadev = (int) (Math.random() * nbMax[0] + 1); }
            
            else if (nbCaseInt == 3) {
                nbadev = (int) (Math.random() * nbMax[1] + 1); }
            
            else if (nbCaseInt == 4) {
                nbadev = (int) (Math.random() * nbMax[2] + 1); }
            
            String nbadevString = String.valueOf(nbadev);*/
            
            //Détection du parametre "mode développeur" et activation si o
    		if (md.equals("o") && nbCaseInt == 2) {
                System.out.print("Mode développeur activé : la combinaison à deviner est " + rand + rand2);}
                System.out.println(" ");
                
                if (md.equals("o") && nbCaseInt == 3) {
                    System.out.print("Mode développeur activé : la combinaison à deviner est " + rand + rand2 + rand3);}
                    System.out.println(" ");
                    
                if (md.equals("o") && nbCaseInt == 4) {
                        System.out.print("Mode développeur activé : la combinaison à deviner est " + rand + rand2 + rand3 + rand4);}
                        System.out.println(" ");
            
            //execution du jeux	
            do {  
            	//Indentation du compteur de coups
            	compteur++;
            	
            	 //capture des essais
                Scanner sc = new Scanner(System.in);
                int[] numbers = new int[nbCaseInt];
                
                System.out.print("\nEntrez votre essai "+compteur+ "/"+nbcpmxcs+" (" + nbCases + " chiffres compris entre 0 et 9) : ");
                
                while (!sc.hasNext("[0-9]+")) {
                	
                	System.out.print("Les caractères sont interdits !!! " + "\nEntrez votre essai "+compteur+ "/"+nbcpmxcs+
                			" (" + nbCases + " chiffres compris entre 0 et 9) : ");
                    sc.next();
                    
                }
                
                	combinaison = sc.next ();
                	
                	if (combinaison.length()>nbCaseInt) {
                	    String cutName = combinaison.substring(0, nbCaseInt);
                	    combinaison = cutName;}
                	   
                	
                    for (int i = 0; i < nbCaseInt; i ++) {
                         numbers [i] = combinaison.charAt(i);}
                  
                    System.out.print("-> Réponse : ");
                //String essaiString = String.valueOf(essai);
                
                if (nbCaseInt == 2) {
                    
                    if (rand.charAt(0)==numbers[0]) {
                    	System.out.print("=");
                    	bon2++;}
                    
                    else if (rand.charAt(0)<numbers[0])
                    	System.out.print("-");
                    
                    else if (rand.charAt(0)>numbers[0])
                    	System.out.print("+");
            	
                    
            	if (rand2.charAt(0)==numbers[1]) {
                	System.out.print("=");
                	bon2++;}
                
                else if (rand2.charAt(0)<numbers[1])
                	System.out.print("-");
                
                else if (rand2.charAt(0)>numbers[1])
                	System.out.print("+");}
                    
                    
                    
                    if (nbCaseInt == 3) {
                        
                        if (rand.charAt(0)==numbers[0]) {
                        	System.out.print("=");
                        	bon2++;}
                        
                        else if (rand.charAt(0)<numbers[0])
                        	System.out.print("-");
                        
                        else if (rand.charAt(0)>numbers[0])
                        	System.out.print("+");
                        
                	
                        if (rand2.charAt(0)==numbers[1]) {
                        	System.out.print("=");
                        	bon2++;}
                    
                        else if (rand2.charAt(0)<numbers[1])
                        	System.out.print("-");
                    
                        else if (rand2.charAt(0)>numbers[1])
                        	System.out.print("+");
                    
                        
                        if (rand3.charAt(0)==numbers[2]) {
                        	System.out.print("=");
                        	bon2++;}
                    
                        else if (rand3.charAt(0)<numbers[2])
                        	System.out.print("-");
                    
                        else if (rand3.charAt(0)>numbers[2])
                        	System.out.print("+");}
                    
                    
                    
                    if (nbCaseInt == 4) {
                        
                        if (rand.charAt(0)==numbers[0]) {
                        	System.out.print("=");
                        	bon2++;}
                        
                        else if (rand.charAt(0)<numbers[0])
                        	System.out.print("-");
                        
                        else if (rand.charAt(0)>numbers[0])
                        	System.out.print("+");
                	
                	if (rand2.charAt(0)==numbers[1]) {
                    	System.out.print("=");
                    	bon2++;}
                    
                    else if (rand2.charAt(0)<numbers[1])
                    	System.out.print("-");
                    
                    else if (rand2.charAt(0)>numbers[1])
                    	System.out.print("+");
                    
                    if (rand3.charAt(0)==numbers[2]) {
                    	System.out.print("=");
                    	bon2++;}
                    
                    else if (rand3.charAt(0)<numbers[2])
                    	System.out.print("-");
                    
                    else if (rand3.charAt(0)>numbers[2])
                    	System.out.print("+");
                    
                    if (rand4.charAt(0)==numbers[3]) {
                    	System.out.print("=");
                    	bon2++;}
                    
                    else if (rand4.charAt(0)<numbers[3])
                    	System.out.print("-");
                    
                    else if (rand4.charAt(0)>numbers[3])
                    	System.out.print("+");}
                
                //Appel de l'algorithme - création de l'objet
                //Algos AlgoCs = new Algos(nbadevString, essaiString);
                
                    //Traitement du jeu
            	       if (compteur == nbcpmxcs || bon2 == nbCaseInt) {
                    		toutBon = true; }
            	       
            	       else {
            	    	   bon2=0; }
                    
                System.out.println("");
               } while (toutBon != true);

             
				
				//Traitement fin de partie
				if (bon2 == nbCaseInt) {
					System.out.println("\nBravo, vous avez gagné !! \nVous avez deviné en " +compteur+ " coups.");
					System.out.println("");
					}
				
				else if (compteur == nbcpmxcs) {
					System.out.println("\nDésolé, vous avez perdu... \nVous avez atteind le nombre maximum de coups (" +nbcpmxcs+ ").");
					System.out.println(""); }

      //Menu de fin de partie, appel de la class Fdp et passage du parametre "quelJeu"
				Fdp fdp = new Fdp(1);
			
        //Fermeture de l'accès au fichier config
        reader.close();
        // Le fichier config n'existe pas
        } catch (FileNotFoundException ex) {
            // erreur E/S
        } catch (IOException ex) {
        	
        }
        }
}
    
	


		