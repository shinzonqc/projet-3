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
		int essai3 = 0;
		int choixfdp = 0;
		int bonMais = 0;
		boolean toutBon = false;
		boolean[] randbool = {false, false, false, false, false, false, false, false, false, false};
		boolean[] essaiBool = {false, false, false, false, false, false, false, false, false, false};
		int bon = 0;
		int depOrdi = 0;
		long doL = 3333333333L;
		
        int compteur = 1;
        int codeSec = 0;
        
        int u = 0;
        int d = 0;
        int c = 0;
        int m = 0;
        int dm = 0;
        int cm = 0;
        int mo = 0;
        int dmo = 0;
        int cmo = 0;
        int b = 0;
        int uessai = 0;
        int dessai = 0;
        int cessai = 0;
        int messai = 0;
        int dmessai = 0;
        int cmessai = 0;
        int moessai = 0;
        int dmoessai = 0;
        int cmoessai = 0;
        int bessai = 0;
        
		
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
        String nbChiffres = props.getProperty("NbChiffreMm");    
        String host = props.getProperty("CoupMaxmm");
        String md = props.getProperty("modeDev");

        //Impression à l'écran du nbre de coups max définis dans le fichier config
        System.out.println("nbr de coups max : " + host);

        // Convertir le string host en int en le transferant dans un int
        int nbcpmxmm = Integer.parseInt(host);
        int nbchmxmm = Integer.parseInt(nbChiffres);
		
        if (nbchmxmm==4) {
    		depOrdi = 3333;
    		}
        else if (nbchmxmm==5) {
    		depOrdi = 33333;
    		}
        else if (nbchmxmm==6) {
    		depOrdi = 333333;
    		}
        else if (nbchmxmm==7) {
    		depOrdi = 3333333;
    		}
        else if (nbchmxmm==8) {
    		depOrdi = 33333333;
    		}
        else if (nbchmxmm==9) {
    		depOrdi = 333333333;
    		}
        if (nbchmxmm==10) {
        	depOrdi = 1333333333;
    		}
        
		int[] rand = new int[nbchmxmm];       
		//Générer aléatoirement 4 à 10 chiffres entre 1 et 6
		for(int i = 0; i < rand.length; i++) {
			rand[i] = (int)(Math.random()*6 + 1); }
		//fin de la boucle
		
		System.out.println("C'est fait j'ai généré mon code secret ! C'est à vous !!");
		System.out.println("");
		
		//saisie du code secret
		if (nbchmxmm==4) {
		do {
			
			Scanner sc1 = new Scanner(System.in);
			
			 	try{
					System.out.print("Entrez votre code secret, " + nbchmxmm + " chiffres (entre 1 et 6) : ");
					codeSec = sc1.nextInt();
					System.out.println(""); }
			 	catch(RuntimeException ex){
	           		System.out.println("Les caractères sont interdits ! : ");}
	           		 
			 	
			} while (codeSec > 6666 || codeSec < 1111);}
		
		if (nbchmxmm==5) {
			do {
				
				Scanner sc1 = new Scanner(System.in);
				
				 	try{
						System.out.print("Entrez votre code secret, " + nbchmxmm + " chiffres (entre 1 et 6) : ");
						codeSec = sc1.nextInt();
						System.out.println(""); }
				 	catch(RuntimeException ex){
		           		System.out.println("Les caractères sont interdits ! : ");}
		           		 
				 	
				} while (codeSec > 66666 || codeSec < 11111);}
		
		if (nbchmxmm==6) {
			do {
				
				Scanner sc1 = new Scanner(System.in);
				
				 	try{
						System.out.print("Entrez votre code secret, " + nbchmxmm + " chiffres (entre 1 et 6) : ");
						codeSec = sc1.nextInt();
						System.out.println(""); }
				 	catch(RuntimeException ex){
		           		System.out.println("Les caractères sont interdits ! : ");}
		           		 
				 	
				} while (codeSec > 666666 || codeSec < 111111);}
		
		if (nbchmxmm==7) {
			do {
				
				Scanner sc1 = new Scanner(System.in);
				
				 	try{
						System.out.print("Entrez votre code secret, " + nbchmxmm + " chiffres (entre 1 et 6) : ");
						codeSec = sc1.nextInt();
						System.out.println(""); }
				 	catch(RuntimeException ex){
		           		System.out.println("Les caractères sont interdits ! : ");}
		           		 
				 	
				} while (codeSec > 6666666 || codeSec < 1111111);}
		
		if (nbchmxmm==8) {
			do {
				
				Scanner sc1 = new Scanner(System.in);
				
				 	try{
						System.out.print("Entrez votre code secret, " + nbchmxmm + " chiffres (entre 1 et 6) : ");
						codeSec = sc1.nextInt();
						System.out.println(""); }
				 	catch(RuntimeException ex){
		           		System.out.println("Les caractères sont interdits ! : ");}
		           		 
				 	
				} while (codeSec > 66666666 || codeSec < 11111111);}
		
		if (nbchmxmm==9) {
			do {
				
				Scanner sc1 = new Scanner(System.in);
				
				 	try{
						System.out.print("Entrez votre code secret, " + nbchmxmm + " chiffres (entre 1 et 6) : ");
						codeSec = sc1.nextInt();
						System.out.println(""); }
				 	catch(RuntimeException ex){
		           		System.out.println("Les caractères sont interdits ! : ");}
		           		 
				 	
				} while (codeSec > 666666666 || codeSec < 111111111);}
		
		if (nbchmxmm==10) {
			do {
				
				Scanner sc1 = new Scanner(System.in);
				
				 	try{
						System.out.print("Entrez votre code secret, " + nbchmxmm + " chiffres (entre 1 et 6) : ");
						codeSec = sc1.nextInt();
						System.out.println(""); }
				 	catch(RuntimeException ex){
		           		System.out.println("Les caractères sont interdits ! : ");}
		           		 
				 	
				} while (codeSec > 666666666 || codeSec < 1111111111);}

		//Affichage initial du mode développeur si à "o" dans config.properties
		 if (md.equals("o")) {
            	System.out.println("Mode développeur activé. Combinaison à deviner : " +
            	Arrays.toString(rand).toString().replaceAll("\\D+", ""));
            	System.out.println("");}
		 
		//isolation des dizaines, centaines, etc...
		 
		 if (nbchmxmm==4) {
			 m=(codeSec-codeSec%1000)/1000;
			 c=(codeSec%1000-codeSec%100)/100;
			 d=(codeSec%100-codeSec%10)/10;
			 u=codeSec%10;
	        
			 messai=(depOrdi-depOrdi%1000)/1000;
			 cessai=(depOrdi%1000-depOrdi%100)/100;
			 dessai=(depOrdi%100-depOrdi%10)/10;
			 uessai=depOrdi%10;
		 }
		 
		 else if (nbchmxmm==5) {
			 dm=(codeSec-codeSec%10000)/10000;
			 m=(codeSec%10000-codeSec%1000)/1000;
			 c=(codeSec%1000-codeSec%100)/100;
			 d=(codeSec%100-codeSec%10)/10;
			 u=codeSec%10;
		     
			 dmessai=(depOrdi-depOrdi%10000)/10000;
		     messai=(depOrdi%10000-depOrdi%1000)/1000;
		     cessai=(depOrdi%1000-depOrdi%100)/100;
		     dessai=(depOrdi%100-depOrdi%10)/10;
		     uessai=depOrdi%10; 
		 }
		 
		 else if (nbchmxmm==6) {
			 cm=(codeSec-codeSec%100000)/100000;
			 dm=(codeSec%100000-codeSec%10000)/10000;
			 m=(codeSec%10000-codeSec%1000)/1000;
			 c=(codeSec%1000-codeSec%100)/100;
			 d=(codeSec%100-codeSec%10)/10;
			 u=codeSec%10;
		     
			 cmessai=(depOrdi-depOrdi%100000)/100000;
			 dmessai=(depOrdi%100000-depOrdi%10000)/10000;
		     messai=(depOrdi%10000-depOrdi%1000)/1000;
		     cessai=(depOrdi%1000-depOrdi%100)/100;
		     dessai=(depOrdi%100-depOrdi%10)/10;
		     uessai=depOrdi%10; 
		 }
		 
		 else if (nbchmxmm==7) {
			 mo=(codeSec-codeSec%1000000)/1000000;
			 cm=(codeSec%1000000-codeSec%100000)/100000;
			 dm=(codeSec%100000-codeSec%10000)/10000;
			 m=(codeSec%10000-codeSec%1000)/1000;
			 c=(codeSec%1000-codeSec%100)/100;
			 d=(codeSec%100-codeSec%10)/10;
			 u=codeSec%10;
		     
			 moessai=(depOrdi-depOrdi%1000000)/1000000;
			 cmessai=(depOrdi%1000000-depOrdi%100000)/100000;
			 dmessai=(depOrdi%100000-depOrdi%10000)/10000;
		     messai=(depOrdi%10000-depOrdi%1000)/1000;
		     cessai=(depOrdi%1000-depOrdi%100)/100;
		     dessai=(depOrdi%100-depOrdi%10)/10;
		     uessai=depOrdi%10; 
		 }
		 
		 else if (nbchmxmm==8) {
			 dmo=(codeSec-codeSec%10000000)/10000000;
			 mo=(codeSec%10000000-codeSec%1000000)/1000000;
			 cm=(codeSec%1000000-codeSec%100000)/100000;
			 dm=(codeSec%100000-codeSec%10000)/10000;
			 m=(codeSec%10000-codeSec%1000)/1000;
			 c=(codeSec%1000-codeSec%100)/100;
			 d=(codeSec%100-codeSec%10)/10;
			 u=codeSec%10;
		     
			 dmoessai=(depOrdi-depOrdi%10000000)/10000000;
			 moessai=(depOrdi%10000000-depOrdi%1000000)/1000000;
			 cmessai=(depOrdi%1000000-depOrdi%100000)/100000;
			 dmessai=(depOrdi%100000-depOrdi%10000)/10000;
		     messai=(depOrdi%10000-depOrdi%1000)/1000;
		     cessai=(depOrdi%1000-depOrdi%100)/100;
		     dessai=(depOrdi%100-depOrdi%10)/10;
		     uessai=depOrdi%10;
		 }
		 
		 else if (nbchmxmm==9) {
			 cmo=(codeSec-codeSec%100000000)/100000000;
			 dmo=(codeSec%100000000-codeSec%10000000)/10000000;
			 mo=(codeSec%10000000-codeSec%1000000)/1000000;
			 cm=(codeSec%1000000-codeSec%100000)/100000;
			 dm=(codeSec%100000-codeSec%10000)/10000;
			 m=(codeSec%10000-codeSec%1000)/1000;
			 c=(codeSec%1000-codeSec%100)/100;
			 d=(codeSec%100-codeSec%10)/10;
			 u=codeSec%10;
		     
			 cmoessai=(depOrdi-depOrdi%100000000)/100000000;
			 dmoessai=(depOrdi%100000000-depOrdi%10000000)/10000000;
			 moessai=(depOrdi%10000000-depOrdi%1000000)/1000000;
			 cmessai=(depOrdi%1000000-depOrdi%100000)/100000;
			 dmessai=(depOrdi%100000-depOrdi%10000)/10000;
		     messai=(depOrdi%10000-depOrdi%1000)/1000;
		     cessai=(depOrdi%1000-depOrdi%100)/100;
		     dessai=(depOrdi%100-depOrdi%10)/10;
		     uessai=depOrdi%10;
		 }
		 
		 else if (nbchmxmm==10) {
			 b=(codeSec-codeSec%1000000000)/1000000000;
			 cmo=(codeSec%1000000000-codeSec%100000000)/100000000;
			 dmo=(codeSec%100000000-codeSec%10000000)/10000000;
			 mo=(codeSec%10000000-codeSec%1000000)/1000000;
			 cm=(codeSec%1000000-codeSec%100000)/100000;
			 dm=(codeSec%100000-codeSec%10000)/10000;
			 m=(codeSec%10000-codeSec%1000)/1000;
			 c=(codeSec%1000-codeSec%100)/100;
			 d=(codeSec%100-codeSec%10)/10;
			 u=codeSec%10;
		     
			 bessai=(depOrdi-depOrdi%1000000000)/1000000000;
			 cmoessai=(depOrdi%1000000000-depOrdi%100000000)/100000000;
			 dmoessai=(depOrdi%100000000-depOrdi%10000000)/10000000;
			 moessai=(depOrdi%10000000-depOrdi%1000000)/1000000;
			 cmessai=(depOrdi%1000000-depOrdi%100000)/100000;
			 dmessai=(depOrdi%100000-depOrdi%10000)/10000;
		     messai=(depOrdi%10000-depOrdi%1000)/1000;
		     cessai=(depOrdi%1000-depOrdi%100)/100;
		     dessai=(depOrdi%100-depOrdi%10)/10;
		     uessai=depOrdi%10;
		 }
	     
	     AlgoMm3 AlgoMm3 = new AlgoMm3(nbchmxmm, dmessai, dm, cmessai, cm, moessai, mo, dmoessai, dmo, cmoessai, cmo, bessai, b, messai, m, compteur, cessai, c, dessai, d, uessai,
	    		 u, nbEssai, nbcpmxmm, essai, essai3, rand, bon, essaiBool, randbool, bonMais, toutBon, md);
		 
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

