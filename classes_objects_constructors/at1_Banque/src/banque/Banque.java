/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;
import java.util.Scanner;
/**
 *
 * @author val
 */
public class Banque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Compte compteA= new Compte (123 , "Mohamed" , 1500.20f);
        compteA.deposerArgent(150);
        compteA.afficher();
        
        int n = sc.nextInt();
        sc.nextLine();
        String np =sc.nextLine();
        float s=sc.nextFloat();
        
        Compte compteB = new Compte (n,np,s);
        compteB.afficher();
        
    }
    
}
