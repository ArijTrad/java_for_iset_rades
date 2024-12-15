public class Main {
    public static void main(String[] args) {
        Facture uneFacture = new Facture(
                125,
                "10-10-2011",
                "Société El oussoud",
                "5, rue ghana Tunis",
                2500.0,
                22.5,
                1500.0,
                0.2);

        // Display the facture
        uneFacture.afficheFacture();

        System.out.println("--------target specefic attribute of the class-----");
        //target specefic attribute of the class
        System.out.println(uneFacture.adresse);

        // Display the facture using toString()
        System.out.println(
                "\n---------------Using toString():-----------------\n" );

        System.out.println(uneFacture.toString());
        System.out.println(uneFacture);

    }
}