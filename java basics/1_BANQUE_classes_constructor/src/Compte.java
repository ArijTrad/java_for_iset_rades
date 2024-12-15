public class Compte {
    int numero;
    String nomprop;
    float solde;

    Compte (int a,String b , float c){
        this.numero=a;
        nomprop=b;
        this.solde=c;
    }

    void retirerArgent(float a){
        solde-=a;
    }
    void deposerArgent (float a){
        solde+=a;
    }
    void afficher(){
        System.out.println("le client "+nomprop+" de № "+numero+ " a un solde egal a "+solde);
    }


}
