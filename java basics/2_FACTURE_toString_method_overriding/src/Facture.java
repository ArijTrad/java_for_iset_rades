public class Facture {
    int numeroFacture;
    String date;
    String client;
    String adresse;
    double montantHorsTaxe;
    double tauxTVA;
    double acompte;
    double timbre;

    Facture(int numeroFacture, String date, String client, String adresse, double montantHorsTaxe, double tauxTVA, double acompte, double timbre) {
        this.numeroFacture = numeroFacture;
        this.date = date;
        this.client = client;
        this.adresse = adresse;
        this.montantHorsTaxe = montantHorsTaxe;
        this.tauxTVA = tauxTVA;
        this.acompte = acompte;
        this.timbre = timbre;
    }

    // Method to calculate Montant TVA
    public double calculMontantTVA() {
        return (montantHorsTaxe * tauxTVA) / 100;
    }

    // Method to calculate Montant Net (Montant HT + TVA)
    public double calculMontantNet() {
        return montantHorsTaxe + calculMontantTVA();
    }

    // Method to calculate Montant Net à Payer
    public double calculMontantNetAPayer() {
        return calculMontantNet() + timbre;
    }

    // Method to calculate Reste à Payer
    public double calculResteAPayer() {
        return calculMontantNetAPayer() - acompte;
    }

    // Method to display the invoice
    //-----------Formatting---------------
    public void afficheFacture() {
            System.out.println("Client: "+client +" date "+date+" adress "+ adresse+
                    " NET "+ calculMontantNet() );
    }

    // toString Method
    /*@Override
    public String toString() { return "Client: "+client +" NET "+ calculMontantNet();  }
    */

    @Override
    public String toString() {
        return "compte= " + acompte +" client= " + client ;
    }
}
