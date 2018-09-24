package jeuxcodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Mm {

	public static void main(String[] args) {
				
				//Définition des variables
				int nbEssai = 0;
				int essai = 0;
				int choixfdp = 0;
				int bonMais = 0;
				boolean toutBon = false;
				boolean[] randbool = {false, false, false, false};
				boolean[] essaiBool = {false, false, false, false};
				int bon = 0;
				
				//Rappel du type de jeu
				System.out.println("");
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("                           MasterMind Challenger");
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("");
				
				//Accéder au fichier de configuration externe
		        File configFile = new File("config.properties");

		        try {
		            FileReader reader = new FileReader(configFile);
		            Properties props = new Properties();
		            props.load(reader);

		        //Appel des paramètres du fichier config et stockage dans des strings
		        String host = props.getProperty("CoupMaxmm");
		        String md = props.getProperty("modeDev");

		        //Impression à l'écran du nbre de coups max définis dans le fichier config
		        System.out.println("nbr de coups max : " + host);

		        // Convertir le string host en int en le transferant dans un int
		        int nbcpmxmm = Integer.parseInt(host);
				
				int[] rand = new int[4];       
				//Générer aléatoirement 4 chiffres entre 1 et 6
	    		for(int i = 0; i < rand.length; i++) {
	    			rand[i] = (int)(Math.random()*6 + 1);
	    		}//fin de la boucle
	    		
	    		//Affichage initial du mode développeur si à "o" dans config.properties
	    		 if (md.equals("o")) {
	                	System.out.println("Mode développeur activé. Combinaison à deviner : " +
	                	Arrays.toString(rand).toString().replaceAll("\\D+", ""));
	                	System.out.println("");}
	    		 
	    		 
	    		AlgoMm AlgoMm = new AlgoMm(rand, essai, bon, bonMais, randbool, essaiBool, nbEssai,
						nbcpmxmm, toutBon, md);
	    		
	    		/* //Execution du programme
				do {
					//Capture des essais
					nbEssai++;
						Scanner sc = new Scanner(System.in);
							System.out.print("Entrez votre essai n° " + nbEssai + "/"  + nbcpmxmm + " : ");
						essai = sc.nextInt();
				
						//Détection du parametre "mode développeur" et activation si à "o" (config.properties)
		                if (md.equals("o")) {
		                	System.out.println("Mode développeur activé. Combinaison à deviner : " +
		                	Arrays.toString(rand).toString().replaceAll("\\D+", ""));
		                	System.out.println(""); }
		    	
		        //Transfer des valeurs de rand (int []) et essai (int) en string
				String randString = Arrays.toString(rand).toString().replaceAll("\\D+", "");
				String essaiString = String.valueOf(essai);
				
				
				
				//Détection et résolution des position : comptage des blancs et noirs
				//Les noirs
				for(int i=0;i<randString.length();i++){
					if(randString.charAt(i)==essaiString.charAt(i)){
						bon++;
						randbool[i]=true;
						essaiBool[i]=true; }
				}
			        //Les blancs
			        for(int k=0;k<essaiString.length();k++){
			        	for(int j=0;j<randString.length();j++){
			        		if(randString.charAt(j)==essaiString.charAt(k) && k!=j && randbool[j]==false && essaiBool[k]==false){
			        			bonMais++;
			        			randbool[j]=true;
			        			essaiBool[k]=true; }
			        	}
			        	}
			        
			       System.out.println("Vous avez "+bon+" bien placés et "+bonMais+" mal placés");
			       System.out.println("");
			       
			       //Traitement du jeu
			       if (nbEssai == nbcpmxmm || bon == 4) {
		        		toutBon = true; }
			        
			       else { 
			        	
			        	bon=0;
						bonMais=0;
						for(int i=0;i<randbool.length;i++){
							randbool[i]=false;
							essaiBool[i]=false;}
			        	}
			        
				}while (toutBon == false);
				
				//Traitement fin de partie
				if (bon == 4) {
				System.out.println("Bravo, vous avez gagné !! \nVous avez deviné en " +nbEssai+ " coups.");
				System.out.println(""); }
				
				else if (nbEssai == nbcpmxmm) {
				System.out.println("Désolé, vous avez perdu... \nVous avez atteind le nombre maximum de coups (" +nbcpmxmm+ ").");
				System.out.println(""); }*/
				
				//Menu de fin de partie, appel de la class Fdp et passage du parametre "quelJeu"
				Fdp fdp = new Fdp(4);
                
                //Fermeture de l'accès au fichier config
                reader.close();
                // Le fichier config n'existe pas
                } catch (FileNotFoundException ex) {
                    // erreur E/S
                } catch (IOException ex) {
                	
                }
                }
				
				}
	



			           
			        
					

			    
			
		





				