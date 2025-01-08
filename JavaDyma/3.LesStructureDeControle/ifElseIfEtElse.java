import java.util.Scanner;

public class ifElseIfEtElse {
    public static void main(String[] args) {

        var saisieUtilisateur = new Scanner(System.in);
        var age = saisieUtilisateur.nextInt();

        if (age >= 18) {
            System.out.println("Vous êtes majeur");
        } else if (age < 0) {
            System.out.println("Age non valide");
        }
        else {
            System.out.println("Vous êtes mineur");
        }
    }
}