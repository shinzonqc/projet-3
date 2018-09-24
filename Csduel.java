package jeuxcodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Csduel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depOrdiInt = 0;
        int compteur = 0;
        int codeSec = 0;
        int bon = 0;
        int bon2 = 0;
        boolean toutBon = false;
        int nbadev = 0;
        String essai = "0";
        int [] nbMax = {99, 999, 9999};
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int randomNumber3 = 0;
        int randomNumber4 = 0;
        
      //Rappel du type de jeu
      		System.out.println("");
      		System.out.println("---------------------------------------------------------------------------");
      		System.out.println("                             Code Secret Duel");
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
            System.out.println("Nombre de coups (config.properties) : " + host);
            System.out.println("");

            // Convertir le string host en int en le transferant dans l'int nbcpmxcs
            int nbcpmxcs = Integer.parseInt(host);
            int nbCaseInt = Integer.parseInt(nbCases);
            
            if (nbCaseInt == 2)
            	depOrdiInt = 55;
            
            else if (nbCaseInt == 3 )
            	depOrdiInt = 555;
            
            else if (nbCaseInt == 4 )
            	depOrdiInt = 5555;
            
            
            // Génération aléatoire d'un nombre à x chiffres (NbCases)
            
            int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    		Random r=new Random();
    		
    		if (nbCaseInt == 2) {
    			randomNumber1=r.nextInt(tab.length);
    			randomNumber2=r.nextInt(tab.length);}
    		
    		else if (nbCaseInt == 3) {
    			randomNumber1=r.nextInt(tab.length);
                randomNumber2=r.nextInt(tab.length);
                randomNumber3=r.nextInt(tab.length);}	
    		
    		else if (nbCaseInt == 4) {
    			randomNumber1=r.nextInt(tab.length);
                randomNumber2=r.nextInt(tab.length);
                randomNumber3=r.nextInt(tab.length);
    			randomNumber4=r.nextInt(tab.length);}
    		
    		
    		/*System.out.print(tab[randomNumber1]);
            System.out.print(tab[randomNumber2]);
            
            
            
            
            	nbadev = (int) (Math.random() * nbMax[0] + 1);
           
            else if (nbCaseInt == 3)
                nbadev = (int) (Math.random() * nbMax[1] + 1);
            
            else if (nbCaseInt == 4)
                nbadev = (int) (Math.random() * nbMax[2] + 1);
            
            String nbadevString = String.valueOf(nbadev);*/
            
          //Détection du parametre "mode développeur" et activation si o
            if (md.equals("o")) {
            System.out.println("Mode développeur activé : la combinaison à deviner est " + randomNumber1 + randomNumber2);}
            System.out.println(" ");
            
            
            //String nbadevString2 = String.format("%02d", nbadev);
            System.out.println("Je viens de générer mon code : c'est à votre tour !");
            System.out.println(" ");
            
            
       //Boucle tant que la longueur n'est pas égale au param de cases du config.properties
		do {
		
		Scanner sc1 = new Scanner(System.in);
		
		 	try{
				System.out.print("entrez votre code secret (" + nbCases + " chiffres compris entre 0 et 9) : ");
				codeSec = sc1.nextInt();
				
				
         }	catch(RuntimeException ex){
           		System.out.println("Les caractères sont interdits ! : ");
           		sc1.close();
         }
		    
		} while (codeSec == nbCases.length() && codeSec < 10000);//fin de boucle
		
		//Extraction des unités, dizaines etc... du nbre a deviner : codeSec
		int m=(codeSec-codeSec%1000)/1000;
		int c=(codeSec%1000)/100;
        int d=(codeSec%100)/10;
        int u=codeSec%10;

        //Extraction des unités, dizaines etc... du nbre entré : essai
        int mdepOrdi=(depOrdiInt%1000)/1000;
        int cdepOrdi=(depOrdiInt%1000)/100;
        int ddepOrdi=(depOrdiInt%100)/10;
        int udepOrdi=depOrdiInt%10;
			
       
	       
        
        //execution du jeux
             
                    
                    
            
          //----------------------------------------------------nbCases = 2------------------------------------------------------          
                    
                   do {
                    
                   if (nbCaseInt == 2) {
                    	
                    	if (ddepOrdi < d) {
                    		System.out.println("Je joue mon coup : " + ddepOrdi);
                    		ddepOrdi++; }
                		
                    	else if (ddepOrdi > d) {
                			System.out.println("Je joue mon coup : " + ddepOrdi);
                    		ddepOrdi--; }
                    	
                    	if (ddepOrdi == d) {
                    		bon++;
                    		System.out.println("Trouvé ! "); } 
                    	
                    	
                    	if (udepOrdi < u) {
                    		System.out.println("Je joue mon coup : " + udepOrdi);
                    		udepOrdi++; }
                    	
                    	else if (udepOrdi > u) {
                    		System.out.println("Je joue mon coup : " + udepOrdi);
                        	udepOrdi--; }
                    	
                    	if (udepOrdi == u) {
                    		bon++;
                    		System.out.println("Trouvé ! "); }
                    	
                    	compteur++;
                    	
            			}
                
       /*   //----------------------------------------------------nbCases = 3------------------------------------------------------
            		
                    if (nbCaseInt == 3) {
                    	
                    	if (cdepOrdi < c) {
                    		System.out.println(" ");
            				System.out.print("Je joue mon coup : " + cdepOrdi);
                    		cdepOrdi++; }
                    		
            			else if (cdepOrdi > c) {
            				System.out.println(" ");
                    		System.out.print("Je joue mon coup : " + cdepOrdi);
                        	cdepOrdi--; }
                    	
                    	if (cdepOrdi == c) {
                    		System.out.println(" ");
                    		bon++;
                    		System.out.println("Trouvé !"); }
                        
                    	
            			if (ddepOrdi < d) {
                    		System.out.print(ddepOrdi);
                    		ddepOrdi++; }
                    		
            			else if (ddepOrdi > d) {
                    		System.out.print(ddepOrdi);
                        	ddepOrdi--; }
            			
            			if (ddepOrdi == d) {
                    		bon++;
                    		System.out.println("Trouvé !"); }
                        
                    		
            			if (udepOrdi < u) {
                        	System.out.println(udepOrdi);
                        	udepOrdi++; }
                        		
            			else if (udepOrdi > u) {
                        	System.out.print(udepOrdi);
                            udepOrdi--; }
            			
            			if (udepOrdi == u) {
                    		bon++;
                    		System.out.println("Trouvé !"); }	
            		
            			compteur++;
            			
                    }
                        		
         //----------------------------------------------------nbCases = 4------------------------------------------------------
                        		
                   else if (nbCaseInt == 4) {
                        
                    	if (mdepOrdi < m) {
                    		System.out.println(" ");
                    		System.out.println("Je joue mon coup : " + mdepOrdi);
                            mdepOrdi++; }
                                		
                        else if (mdepOrdi > m) {
                        	System.out.println(" ");
                        	System.out.println("Je joue mon coup : " + mdepOrdi);
                            mdepOrdi--; }
                    	
                    	if (mdepOrdi == m) {
                    		bon++;
                    		System.out.println("Trouvé !"); }
                    	
                                    
                    	if (cdepOrdi < c) {
                    		System.out.println(" ");
                        	System.out.println("Je joue mon coup : " + cdepOrdi);
                            cdepOrdi++; }
                                		
                        else if (cdepOrdi > c) {
                            System.out.println(" ");
                            System.out.println("Je joue mon coup : " + cdepOrdi);
                            cdepOrdi--; }
                        			
                        if (cdepOrdi == c) {
                        	bon++;
                        	System.out.println("Trouvé ! "); }
                                    
                    		
                        if (ddepOrdi < d) {
                            System.out.println("Je joue mon coup : " + ddepOrdi);
                            ddepOrdi++; }
                                		
                        else if (ddepOrdi > d) {
                            System.out.println("Je joue mon coup : " + ddepOrdi);
                            ddepOrdi--; }
                        			
                        if (ddepOrdi == d) {
                        	bon++; 
                        	System.out.println("Trouvé ! "); }
                        			
                    		      
                    	if (udepOrdi < u) {
                            System.out.println("Je joue mon coup : " + udepOrdi);
                            udepOrdi++; }
                                    		
                        else if (udepOrdi > u) {
                            System.out.println("Je joue mon coup : " + udepOrdi);
                            udepOrdi--; }
                        			
                        if (udepOrdi == u) {
                        	bon++;
                        	System.out.println("Trouvé ! ");
                        	System.out.println(" "); } 
                        			
                        compteur++;
                    }*/
                    
                  //capture des essais
                    Scanner sc = new Scanner(System.in);
                    
                    try{
                    	System.out.print("\nEntrez votre essai "+compteur+ "/"+nbcpmxcs+" (" + nbCases + " chiffres compris entre 0 et 9) : ");
                    	
                    	//Retour du scanner pour prochaine entrée
                        essai = sc.nextLine();
                        System.out.print(" -> Réponse : ");
                        
                        
                        
                 }	catch(RuntimeException ex){
                   		System.out.println("Les caractères sont interdits ! : ");
                   		
                 }
                    
                    //String essaiString = String.valueOf(essai);
                    
                    System.out.print("randomNumber1 :" + randomNumber1);
                    System.out.print("essai.charAt(0) :" + essai.charAt(0));
                    
                    if (randomNumber1==essai.charAt(0)) {
                    	System.out.print("=");
                    	bon2++;}
                    
                    else if (randomNumber1<essai.charAt(0)) {
                    	System.out.print("-");
                    }
                    
                    else if (randomNumber1>essai.charAt(0)) {
                    	System.out.print("+");
                    }
                    	
                    /*for(int i=0;i<nbadevString.length();i++){
                 		if(nbadevString.charAt(i)==essaiString.charAt(i)){
                 			System.out.print("=");
                 			bon2++;
                 		}
                 		else if(nbadevString.charAt(i)<essaiString.charAt(i)){
                 			System.out.print("-");
                 		}
                 		else if(nbadevString.charAt(i)>essaiString.charAt(i)){
                 			System.out.print("+");
                 		}
                 		
                 		}*/
                    System.out.println("");
                    
                  //Traitement du jeu
           	       if (compteur == nbcpmxcs || bon == nbCaseInt || bon2 == nbCaseInt) {
                   		toutBon = true; }
                  
                   }while(toutBon != true);
                    
                    System.out.println("compteur = "+compteur);
                    System.out.println("nb de coups max : "+nbcpmxcs);
                    
                  //Traitement fin de partie
            		if (bon == nbCaseInt) {
            		System.out.println("J'ai gagné ! En " +compteur+ " coups.");
            		System.out.println(""); }
            		
            		else if (bon2 == nbCaseInt) {
                		System.out.println("Vous avez gagné... En " +compteur+ " coups.");
                		System.out.println(""); }
            		
            		else if (compteur == nbcpmxcs) {
            			System.out.println("Tous les 2 perdu... \nNombre maximum de coups (" +nbcpmxcs+ ") Atteint.");
            			System.out.println(""); }
                    
                    //Création de l'objet "AlgoCsduel" contenu dans la class "Algos"
        
        String codeSecString = String.valueOf(codeSec);
        
            		/*AlgoCsduel AlgoCsduel = new AlgoCsduel (nbCaseInt, mdepOrdi, cdepOrdi, ddepOrdi, udepOrdi, m, c, d, u, bon,
                			bon2, compteur, nbcpmxcs, nbCases, essai, nbadevString, toutBon);*/
            		
            		
            		//Menu de fin de partie, appel de la class Fdp et passage du parametre "quelJeu"
    				Fdp fdp = new Fdp(3);
            
    		 //Fermeture de l'accès au fichier config
            reader.close();
            // Le fichier config n'existe pas
        } catch (FileNotFoundException ex) {
            // erreur E/S
        } catch (IOException ex) {

        }
        }
}