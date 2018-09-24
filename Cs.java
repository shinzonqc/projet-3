package jeuxcodes;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;
import java.lang.String;

public class Cs {

    public static void main(String[] args)  {

        //Création variables
        int nbadev = 0;
        int essai = 0;
        int compteur = 0;
        int [] nbMax = {99, 999, 9999};
        
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
            System.out.println("");
            
            // Convertir le string host en int en le transferant dans l'int nbcpmxcs2
            int nbcpmxcs = Integer.parseInt(host);
            int nbCaseInt = Integer.parseInt(nbCases);
            
            // Génération aléatoire d'un nombre à x chiffres (NbCases)
            if (nbCaseInt == 2) {
            	nbadev = (int) (Math.random() * nbMax[0] + 1); }
            
            else if (nbCaseInt == 3) {
                nbadev = (int) (Math.random() * nbMax[1] + 1); }
            
            else if (nbCaseInt == 4) {
                nbadev = (int) (Math.random() * nbMax[2] + 1); }
            
            String nbadevString = String.valueOf(nbadev);
            
            //Détection du parametre "mode développeur" et activation si o
            if (md.equals("o")) {
            	System.out.println("Mode développeur activé : la combinaison à deviner est " + nbadevString);}
            
            //execution du jeux	
            do {  
            	//Indentation du compteur de coups
            	compteur++;
            	
            	//capture des essais
                Scanner sc = new Scanner(System.in);
                
                try{
                	System.out.print("\nEntrez votre essai "+compteur+ "/"+nbcpmxcs+" (" + nbCases + " chiffres compris entre 0 et 9) : ");
                	
                	//Retour du scanner pour prochaine entrée
                    essai = sc.nextInt();
                    System.out.print(" -> Réponse : ");
                    
                    
             }	catch(RuntimeException ex){
               		System.out.println("Les caractères sont interdits ! : ");
               		
             }
                
                String essaiString = String.valueOf(essai);
                
                //Appel de l'algorithme - création de l'objet
                Algos AlgoCs = new Algos(nbadevString, essaiString);
                
            
                System.out.println("");
               } while (essai != nbadev && compteur < nbcpmxcs);

             
				
				//Traitement fin de partie
				if (essai == nbadev) {
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
    
	


		