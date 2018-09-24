package jeuxcodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Csdef {

	public static void main(String[] args) {
		
		int depOrdiInt = 0;
        int compteur = 1;
        int codeSec = 0;
        int bon = 0;
        int limite = 0;
        
        boolean toutBon = false;
        
      //Rappel du type de jeu
      		System.out.println("");
      		System.out.println("---------------------------------------------------------------------------");
      		System.out.println("                            Code Secret Défenseur");
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

            // Convertir le string host en int en le transferant dans l'int nbcpmxcs
            int nbcpmxcs = Integer.parseInt(host);
            int nbCaseInt = Integer.parseInt(nbCases);
            
            //Impression à l'écran du nbre de coups max définis dans le fichier config
            System.out.println("Nbr de coups max : " + nbcpmxcs);
            System.out.println("");
            
            if (nbCaseInt == 2) {
            	depOrdiInt = 55;
            	limite = 10; }
            
            else if (nbCaseInt == 3 ) {
            	depOrdiInt = 555;
            	limite = 100; }
            	
            
            else if (nbCaseInt == 4 ) {
            	depOrdiInt = 5555;
            	limite = 1000; }
            	
            
           
            
        //Boucle tant que la longueur n'est pas égale au param de cases du config.properties
		do {
		
		
			Scanner sc1 = new Scanner(System.in);
		 	try{
				System.out.print("entrez votre code secret (" + nbCases + " chiffres compris entre 0 et 9) : ");
				codeSec = sc1.nextInt();
				
         }	catch(RuntimeException ex){
           		System.out.println("Les caractères sont interdits ! : ");
           		sc1.close(); }
		 	
		}while (codeSec > limite * 10-1 || codeSec < limite);//fin de boucle
		
		System.out.println("");
		
		
		//Extraction des unités, dizaines etc... du nbre a deviner : codeSec
		int m=(codeSec-codeSec%1000)/1000;
		int c=(codeSec%1000)/100;
        int d=(codeSec%100)/10;
        int u=codeSec%10;

        //Extraction des unités, dizaines etc... du nbre entré : essai
        int mdepOrdi=(depOrdiInt-depOrdiInt%1000)/1000;
        int cdepOrdi=(depOrdiInt%1000)/100;
        int ddepOrdi=(depOrdiInt%100)/10;
        int udepOrdi=depOrdiInt%10;
			
        //Création de l'objet "AlgoCsdef" contenu dans la class "Algos"
        AlgoCsdef AlgoCsdef = new AlgoCsdef (nbCaseInt, bon, mdepOrdi, cdepOrdi, ddepOrdi, udepOrdi, compteur, 
        		nbcpmxcs, m, c, d, u, toutBon, codeSec);
          
          //Menu de fin de partie, appel de la class Fdp et passage du parametre "quelJeu"
			Fdp fdp = new Fdp(2);
            
    		 //Fermeture de l'accès au fichier config
            reader.close();
            // Le fichier config n'existe pas
        } catch (FileNotFoundException ex) {
            // erreur E/S
        } catch (IOException ex) {

        }
        }
}
	

        

