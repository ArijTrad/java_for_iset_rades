class Personne {
    private String nom;
    private String prenom;
    private String profession;
    private int age;

    // Constructeur
     Personne(String nom, String prenom, String profession, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
        this.age = age;
    }

    // Méthode sePresenter
     void sePresenter() {
        System.out.println( nom+" "+prenom+" agee de "+age);
    }
}
