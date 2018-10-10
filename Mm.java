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
	



			           
			        
					

			    
			
		





				