package jeuxcodes;

import java.util.Arrays;
import java.util.Scanner;

class Algos {
	
		 //Algo Cs
		public Algos (String nbadevString, String essaiString) {
		
		for(int i=0;i<nbadevString.length();i++){
     		if(nbadevString.charAt(i)==essaiString.charAt(i)){
     			System.out.print("=");
     		}
     		else if(nbadevString.charAt(i)<essaiString.charAt(i)){
     			System.out.print("-");
     		}
     		else if(nbadevString.charAt(i)>essaiString.charAt(i)){
     			System.out.print("+");
     		}
     		
     		}
		  } 
	}
		
		
class AlgoCsdef {
	
	 //Algo Csdef
	public AlgoCsdef (int nbCaseInt, int bon, int mdepOrdi, int cdepOrdi, int ddepOrdi, int udepOrdi, int compteur, 
			int nbcpmxcs, int m, int c, int d, int u, boolean toutBon, int codeSec) {
	
		do {
            
			//----------------------------------------------------nbCases = 2------------------------------------------------------
			
            if (nbCaseInt == 2) {
            	
            	bon = 0;	
            	
            	if (ddepOrdi < d) {
            		ddepOrdi++;
            		compteur++;
            		System.out.println("Les dizaines augmente = " + ddepOrdi + "\nNb de coups augmente: " + compteur);
            		System.out.println(" "); }
        		
            	else if (ddepOrdi > d) {
        			ddepOrdi--;
            		compteur++;
            		System.out.println("Les dizaines  diminue = " + ddepOrdi + "\nNb de coups augmente: " + compteur);
            		System.out.println(" "); }
            	
            	else if (ddepOrdi == d) {
            		bon++;
            		System.out.println("Dizaines trouvées !");
            		System.out.println(" "); } 
            	
            	
            	if (udepOrdi < u) {
            		udepOrdi++;
            		compteur++;
            		System.out.println("Les unités augmente = " + udepOrdi + "\nnb de coups augmente: " + compteur);
            		System.out.println(" ");}
            	
            	else if (udepOrdi > u) {
            		udepOrdi--;
                	compteur++;
                	System.out.println("Les unités diminue = " + udepOrdi + "\nnb de coups augmente: " + compteur);
                	System.out.println(" ");}
            	
            	else if (udepOrdi == u) {
            		bon++;
            		System.out.println("Unités trouvées !");
            		System.out.println(" "); }
            	
            	
            	if (bon == 2 || compteur == nbcpmxcs) {
            		toutBon = true; }
        	 
	}
  //----------------------------------------------------nbCases = 3------------------------------------------------------
    		
           else if (nbCaseInt == 3) {
        	   
            bon = 0;	
           	
            	if (cdepOrdi < c) {
    				cdepOrdi++;
            		compteur++;
            		System.out.println("Les centaines augmente = " + cdepOrdi + "\nnb de coups augmente: " + compteur);
            		System.out.println(" "); }
            		
    			else if (cdepOrdi > c) {
            		cdepOrdi--;
                	compteur++;
                	System.out.println("Les centaines diminue = " + cdepOrdi + "\nnb de coups augmente: " + compteur);
                	System.out.println(" "); }
            	
    			else if (cdepOrdi == c) {
            		bon++;
            		System.out.println("Centaines Trouvées !");
            		System.out.println(" "); }
                
            	
            	if (ddepOrdi < d) {
            		ddepOrdi++;
            		compteur++;
            		System.out.println("Les dizaines augmente = " + ddepOrdi + "\nNb de coups augmente: " + compteur);
            		System.out.println(" "); }
        		
            	else if (ddepOrdi > d) {
        			ddepOrdi--;
            		compteur++;
            		System.out.println("Les dizaines  diminue = " + ddepOrdi + "\nNb de coups augmente: " + compteur);
            		System.out.println(" "); }
            	
            	else if (ddepOrdi == d) {
            		bon++;
            		System.out.println("Dizaines trouvées !");
            		System.out.println(" "); } 
            	
            	
            	if (udepOrdi < u) {
            		udepOrdi++;
            		compteur++;
            		System.out.println("Les unités augmente = " + udepOrdi + "\nnb de coups augmente: " + compteur);
            		System.out.println(" ");}
            	
            	else if (udepOrdi > u) {
            		udepOrdi--;
                	compteur++;
                	System.out.println("Les unités diminue = " + udepOrdi + "\nnb de coups augmente: " + compteur);
                	System.out.println(" ");}
            	
            	else if (udepOrdi == u) {
            		bon++;
            		System.out.println("Unités trouvées !");
            		System.out.println(" "); }
            	
            	
            	if (bon == 3 || compteur == nbcpmxcs) {
            		toutBon = true; }
            	
            	}
            	
            		
    		
            	
 //----------------------------------------------------nbCases = 4------------------------------------------------------
                		
            else if (nbCaseInt == 4) {
            	
                bon = 0;
                
            	if (mdepOrdi < m) {
                	mdepOrdi++;
                    compteur++;
                    System.out.println("Les milliers augmente = " + mdepOrdi + "\nnb de coups augmente: " + compteur);
                    System.out.println(" "); }
                        		
                else if (mdepOrdi > m) {
                    mdepOrdi--;
                    compteur++;
                    System.out.println("Les milliers diminue = " + mdepOrdi + "\nnb de coups augmente: " + compteur);
                    System.out.println(" "); }
            	
                else if (mdepOrdi == m) {
            		bon++;
            		System.out.println("Milliers trouvés !");
            		System.out.println(" "); }
            	
                 	
            	if (cdepOrdi < c) {
    				cdepOrdi++;
            		compteur++;
            		System.out.println("Les centaines augmente = " + cdepOrdi + "\nnb de coups augmente: " + compteur);
            		System.out.println(" "); }
            		
    			else if (cdepOrdi > c) {
            		cdepOrdi--;
                	compteur++;
                	System.out.println("Les centaines diminue = " + cdepOrdi + "\nnb de coups augmente: " + compteur);
                	System.out.println(" "); }
            	
    			else if (cdepOrdi == c) {
            		bon++;
            		System.out.println("Centaines trouvées !");
            		System.out.println(" "); }
                
            	
            	if (ddepOrdi < d) {
            		ddepOrdi++;
            		compteur++;
            		System.out.println("Les dizaines augmente = " + ddepOrdi + "\nNb de coups augmente: " + compteur);
            		System.out.println(" "); }
        		
            	else if (ddepOrdi > d) {
        			ddepOrdi--;
            		compteur++;
            		System.out.println("Les dizaines  diminue = " + ddepOrdi + "\nNb de coups augmente: " + compteur);
            		System.out.println(" "); }
            	
            	else if (ddepOrdi == d) {
            		bon++;
            		System.out.println("Dizaines trouvées !");
            		System.out.println(" "); } 
            	
            	
            	if (udepOrdi < u) {
            		udepOrdi++;
            		compteur++;
            		System.out.println("Les unités augmente = " + udepOrdi + "\nnb de coups augmente: " + compteur);
            		System.out.println(" ");}
            	
            	else if (udepOrdi > u) {
            		udepOrdi--;
                	compteur++;
                	System.out.println("Les unités diminue = " + udepOrdi + "\nnb de coups augmente: " + compteur);
                	System.out.println(" ");}
            	
            	else if (udepOrdi == u) {
            		bon++;
            		System.out.println("Unités trouvées !");
            		System.out.println(" "); }
            	
            	
            	if (bon == 4 || compteur == nbcpmxcs) {
            		toutBon = true; }
            	}
            	
            }while (toutBon != true);
		
		if (bon == nbCaseInt) {
        	System.out.println("J'ai trouvé !! " + "en " + compteur + " coups.");}

        //nbre de coups max atteind
        else if (compteur == nbcpmxcs) {
            System.out.println ("Le nombre maximum d'essais est atteind, J'ai perdu !" + "\nNombre d'essais : "
                    + compteur + "\nLa combinaison à deviner était : " + codeSec);}
		
	  } 
}
	
class AlgoCsduel {
	
	 //Algo Csduel
	public AlgoCsduel (int nbCaseInt, int mdepOrdi, int cdepOrdi, int ddepOrdi, int udepOrdi, int m, int c, int d, int u, int bon,
			int bon2, int compteur, int nbcpmxcs, String nbCases, int essai, String nbadevString, boolean toutBon) {
	
		
        String essaiString;
		
		 do {
             
			//----------------------------------------------------nbCases = 2------------------------------------------------------ 
             if (nbCaseInt == 2) {
              	
              	if (ddepOrdi < d) {
              		System.out.println(" ");
              		System.out.println("C'est à mon tour, je joue mon coup : " + ddepOrdi + udepOrdi);
              		ddepOrdi++; }
          		
              	else if (ddepOrdi > d) {
              		System.out.println(" ");
          			System.out.println("C'est à mon tour, je joue mon coup : " + ddepOrdi + udepOrdi);
              		ddepOrdi--; }
              	
              	else if (ddepOrdi == d) {
              		bon++;
              		 } 
              	
              	
              	if (udepOrdi < u) {
              		
              		udepOrdi++; }
              	
              	else if (udepOrdi > u) {
              		
                  	udepOrdi--; }
              	
              	else if (udepOrdi == u) {
              		bon++;
              		 }
              	
              	
              	
              	compteur++;
              	
      			}
          
    //----------------------------------------------------nbCases = 3------------------------------------------------------
      		
              if (nbCaseInt == 3) {
              	
              	if (cdepOrdi < c) {
              		System.out.println(" ");
      				System.out.print("Je joue mon coup : " + cdepOrdi);
              		cdepOrdi++; }
              		
      			else if (cdepOrdi > c) {
      				System.out.println(" ");
              		System.out.print("Je joue mon coup : " + cdepOrdi);
                  	cdepOrdi--; }
              	
      			else if (cdepOrdi == c) {
              		System.out.println(" ");
              		bon++;
              		System.out.println("Trouvé !"); }
                  
              	
      			if (ddepOrdi < d) {
              		System.out.print(ddepOrdi);
              		ddepOrdi++; }
              		
      			else if (ddepOrdi > d) {
              		System.out.print(ddepOrdi);
                  	ddepOrdi--; }
      			
      			else if (ddepOrdi == d) {
              		bon++;
              		System.out.println("Trouvé !"); }
                  
              		
      			if (udepOrdi < u) {
                  	System.out.println(udepOrdi);
                  	udepOrdi++; }
                  		
      			else if (udepOrdi > u) {
                  	System.out.print(udepOrdi);
                      udepOrdi--; }
      			
      			else if (udepOrdi == u) {
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
              }
              
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
              essaiString = String.valueOf(essai);
               
              for(int i=0;i<nbadevString.length();i++){
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
           		
           		}
              System.out.println("");
              
              //sc.nextLine();
              
              
            //Traitement du jeu
      	       if (compteur == nbcpmxcs || bon == nbCaseInt || bon2 == nbCaseInt) {
              		toutBon = true; }
      	       
      	       else {
      	    	   bon=0;
      	    	   bon2=0;
      	       }
             
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
		 
	  } 
}
	
class AlgoMm {
	
	 //Algo Mm
	public AlgoMm (int[] rand, int essai, int bon, int bonMais, boolean []randbool, boolean []essaiBool, int nbEssai,
			int nbcpmxmm, boolean toutBon, String md) {
	
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
		System.out.println(""); }
	  } 
}

class AlgoMm2 {
	
	 //Algo Cs
	public AlgoMm2 (int messai, int m, int compteur, int cessai, int c, int dessai, int d, int uessai, int u) {
	
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
 
        System.out.println("J'ai trouvé la réponse en " + compteur + " coups.");
	  } 
}

class AlgoMm3 {
	
	 //Algo Mm3
	public AlgoMm3 (int messai, int m, int compteur, int cessai, int c, int dessai, int d, int uessai, int u, int nbEssai, int nbcpmxmm,
			int essai, int[] rand, int bon, boolean[] essaiBool, boolean[] randbool, int bonMais, boolean toutBon, String md) {
	
		 //Execution du programme
		do {
			
			if (messai < m) {
				
        		System.out.println(" ");
        		System.out.println("messai = " + messai);
        		messai++;
        		compteur++;
        		System.out.println("messai  augmente = " + messai);
        		System.out.println(" ");
			}
        	
        	else if (messai > m) {
        		
        		System.out.println(" ");
        		System.out.println("messai = " + messai);
        		messai--;
        		compteur++;
        		System.out.println("messai  diminue = " + messai);
        		System.out.println(" ");
        	}
        
    		
    		if (cessai < c) {
    			compteur++;
    			System.out.println(" ");
    			System.out.println("cessai = " + cessai);
    			cessai++;
    			compteur++;
    			System.out.println("cessai  augmente = " + cessai);
    			System.out.println(" ");
    			}
            
    		else if (cessai > c) {
        		
        		System.out.println(" ");
        		System.out.println("cessai = " + cessai);
        		cessai--;
        		compteur++;
        		System.out.println("cessai  diminue = " + cessai);
        		System.out.println(" ");
        	}
        
    		if (dessai < d) {
    			compteur++;
    			System.out.println(" ");
    			System.out.println("dessai = " + dessai);
    			dessai++;
    			compteur++;
    			System.out.println("dessai  augmente = " + dessai);
    			System.out.println(" ");
    			}
    		
    		else if (dessai > d) {
        		
        		System.out.println(" ");
        		System.out.println("dessai = " + dessai);
        		dessai--;
        		compteur++;
        		System.out.println("dessai  diminue = " + dessai);
        		System.out.println(" ");
        	}
    		
    	
    		if (uessai < u) {
			compteur++;
				System.out.println(" ");
				System.out.println("uessai = " + uessai);
				uessai++;
				compteur++;
				System.out.println("uessai  augmente = " + uessai);
				System.out.println(" ");
			}
     
    		else if (uessai > u) {
    		
    			System.out.println(" ");
    			System.out.println("uessai = " + uessai);
    			uessai--;
    			compteur++;
    			System.out.println("uessai  diminue = " + uessai);
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
			System.out.println(""); }
	  } 
}


