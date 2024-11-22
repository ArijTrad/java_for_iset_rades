/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author val
 */
public class Compte {
    public int numero;
    public String nomPropriaitaire;
    public float solde;
    


    
    //constructor**************************************
    public Compte (){}
    
    public Compte(int numero , String nomPropriaitaire , float solde){
        this.numero = numero;
        this.nomPropriaitaire = nomPropriaitaire;
        this.solde=solde;
    }
    
    //methods*******************************************
    public void retirerArgent(float montant) {
    this.solde = this.solde - montant; 
    }
    public void deposerArgent (float montnat){
    this.solde = this.solde + montnat;
    }
    public float consulter_solde(){
        return this.solde ;
    }
    public void afficher(){
    System.out.println ("le client " + nomPropriaitaire + " de numero " + numero + " a un solde de " + solde);
    }
    
}
