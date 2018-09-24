package jeuxcodes;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        int choix = 0;
        int choix2 = 0;
        int choix3 = 0;

        do {

            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("**                          1 - Code secret                              **");
            System.out.println("**                                                                       **");
            System.out.println("**                          2 - MasterMind                               **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            
            Scanner ch = new Scanner(System.in);
            try{
            	System.out.print("                       Faite votre choix (1 ou 2) : ");
            	choix = ch.nextInt();
            }catch(RuntimeException ex){
                System.out.println("Les caractères sont interdits ! Faite votre choix (1 ou 2) : ");
            }
           
        } while (choix != 1 && choix != 2);


        if (choix == 1)
        {
            do {
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println("**                                                                       **");
            System.out.println("**                             Code secret                               **");
            System.out.println("**                                                                       **");
            System.out.println("**                          1 - Mode Challenger                          **");
            System.out.println("**                          2 - Mode Défenseur                           **");
            System.out.println("**                          3 - Mode Duel                                **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            Scanner ch2 = new Scanner(System.in);
            
            try{
            	System.out.print("                     Faite votre choix (1 à 9) : ");
            	choix2 = ch2.nextInt();
            }catch(RuntimeException ex){
                System.out.println("Les caractères sont interdits ! Faite votre choix (1 à 9) : ");
            }
            
            	} while (choix2 != 1 && choix2 != 2 && choix2 != 3);
            
            if (choix2 == 3)

            try {
                Cs.main(new String[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }

            else if (choix2 == 2)

            try {
                Csdef.main(new String[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            else if (choix2 == 1)

                try {
                    Cs.main(new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }


        }

        
        else if (choix == 2)
        {
            do {
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println("**                                                                       **");
            System.out.println("**                               MasterMind                              **");
            System.out.println("**                                                                       **");
            System.out.println("**                       1 - Mastermind (challenger)                     **");
            System.out.println("**                       2 - Mastermind (défenseur)                      **");
            System.out.println("**                       3 - Mastermind (duel)                           **");
            System.out.println("**                                                                       **");
            System.out.println("**                                                                       **");
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            Scanner ch3 = new Scanner(System.in);
            
            try{
            	System.out.print("                     Faite votre choix (1 à 3) : ");
            	choix3 = ch3.nextInt();
            }catch(RuntimeException ex){
                System.out.println("Les caractères sont interdits ! Faite votre choix (1 à 3) : ");
            }
            
            	} while (choix3 != 1 && choix3 != 2 && choix3 != 3);
            
            
            if (choix3 == 3)

                try {
                	Mm3.main(new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
            else if (choix3 == 2)

            try {
                Mm2.main(new String[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            else if (choix3 == 1)

                try {
                    Mm.main(new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }


        }
        
        
        
       
        }
    }


