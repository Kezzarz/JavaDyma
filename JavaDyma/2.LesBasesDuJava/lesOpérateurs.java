package LesBasesDuJava;
public class lesOpérateurs {
    public static void main(String[] args) {
        var addition = 1+2;
        var soustraction = 5-2.2;
        var multiplication = 3*4;
        var division = 10/2;
        var modulo = 10%3;

        System.out.println(modulo);

        var addition2 = 1+2;
        addition2 += 5; // addition = addition + 5

        System.out.println(addition2);

        //opérateur de comaparaison
        var plusPetit = 4;
        var plusGrand = 8;
        var comparaison = plusPetit > plusGrand;

        System.out.println(comparaison);

        //Opérateur logique
        var oui = true;
        var non = false;

        var comparaison2 = oui && non;
        System.out.println(comparaison2);

        //Cas particulier les chaines de caractéres
        var chaine = "contenu";
        var chaine2 = new String( "contenu");

        System.out.println(chaine.equals(chaine2));

        //Priorité des opérateurs
        var calcul = (12 + 3) * 2;

        System.out.println(calcul);
    }
}
