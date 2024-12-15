public class Bank {
    public static void main(String[] args) {
        Compte a=new Compte(525889,"Hosni",1500f);
        a.afficher();
        a.nomprop="hosni yassmine";
        a.afficher();
        a.retirerArgent(150f);
        a.afficher();
        a.deposerArgent(500f);
        a.afficher();
        Compte b= a;
        System.out.println("compte b");
        b.afficher();
        b.deposerArgent(500f);
        b.afficher();

        System.out.println("compte a");
        a.afficher();


    }
}