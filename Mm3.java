package jeuxcodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Mm3 {

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
		
		int depOrdi = 3333;
        int compteur = 1;
        int codeSec = 0;
		
		//Rappel du type de jeu
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("                             MasterMind Duel");
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
		//Générer aléatoirement 5 chiffres entre 1 et 6
		for(int i = 0; i < rand.length; i++) {
			rand[i] = (int)(Math.random()*6); }
		//fin de la boucle
		
		System.out.println("C'est fait j'ai généré mon code secret ! C'est à vous !!");
		//saisie du code secret
		do {
			
			Scanner sc1 = new Scanner(System.in);
			
			 	try{
					System.out.print("Entrez votre code secret (4 chiffres entre 0 et 5) : ");
					codeSec = sc1.nextInt();
					System.out.println(""); }
			 	catch(RuntimeException ex){
	           		System.out.println("Les caractères sont interdits ! : ");
	           		sc1.close(); }
			 	
			} while (codeSec > 5555 );

		//Affichage initial du mode développeur si à "o" dans config.properties
		 if (md.equals("o")) {
            	System.out.println("Mode développeur activé. Combinaison à deviner : " +
            	Arrays.toString(rand).toString().replaceAll("\\D+", ""));
            	System.out.println("");}
		 
		//isolation des milliers, centaines, etc...
		 int m=(codeSec-codeSec%1000)/1000;
		 int c=(codeSec%1000-codeSec%100)/100;
		 int d=(codeSec%100-codeSec%10)/10;
		 int u=codeSec%10;
	        
	     int messai=(depOrdi-depOrdi%1000)/1000;
	     int cessai=(depOrdi%1000-depOrdi%100)/100;
	     int dessai=(depOrdi%100-depOrdi%10)/10;
	     int uessai=depOrdi%10;
	     
	     AlgoMm3 AlgoMm3 = new AlgoMm3(messai, m, compteur, cessai, c, dessai, d, uessai, u, nbEssai, nbcpmxmm,
	 			essai, rand, bon, essaiBool, randbool, bonMais, toutBon, md);
		 
		 /*//Execution du programme
		do {
			
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
    	
        //Transfer des valeurs de rand (int []) et essai (int) ens string
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
	       if (nbEssai == nbcpmxmm || bon == 4 || messai == m && cessai == c && dessai == d && uessai == u) {
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
		
		else if (messai == m && cessai == c && dessai == d && uessai == u) {
		System.out.println("Désolé, vous avez perdu... \nJ'ai gagné en "+nbEssai+" coups.");
		System.out.println(""); }
		
		else if (nbEssai == nbcpmxmm) {
			System.out.println("Nous avons tous les 2 perdu... \nNombre maximum de coups (" +nbcpmxmm+ ") Atteint.");
			System.out.println(""); }*/
		
		//Menu de fin de partie, appel de la class Fdp et passage du parametre "quelJeu"
		Fdp fdp = new Fdp(6);
        
        //Fermeture de l'accès au fichier config
        reader.close();
        // Le fichier config n'existe pas
        } catch (FileNotFoundException ex) {
            // erreur E/S
        } catch (IOException ex) {
        	
        }
        }
		
		}

