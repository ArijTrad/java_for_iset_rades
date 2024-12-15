class Test {
    public static void main(String[] args) {

        //tables in java
        //table declaration
        // type_of_elements_inside_thetable[] tab_name = new type_of_el[number of elements] ;
        int alen=2;
        String[] animals = new String[alen];
        animals[1]="1";
        for (int i=0;i<alen;i++){
            System.out.println(animals[i]);
        }

        //strings
        String a="abc";
        System.out.println(a+ "  is length  "+a.length());



        // Créer un tableau de 3 objets Personne
        Personne[] TabPersonne = new Personne[3];

        // Initialiser les objets dans le tableau
        TabPersonne[0] = new Personne("Besbes", "Ahmed", "Étudiant", 20);
        TabPersonne[1] = new Personne("Ben zekri", "Sami", "Ingénieur", 25);
        TabPersonne[2] = new Personne("Torjmen", "Fahd", "Technicien", 30);

        // Parcourir et afficher les informations
        for (int i = 0; i < 3; i++) {
            TabPersonne[i].sePresenter();
        }
    }
}
