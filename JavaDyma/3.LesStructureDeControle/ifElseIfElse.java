import java.util.Scanner;

public class ifElseIfElse {
    public static void main(String[] args) {

        var saisieUtilisateur = new Scanner(System.in);

        System.out.println("Saisissez un chiffre :");
            var age = saisieUtilisateur.nextInt();

            if (age >= 100){
                System.out.println("Vous êtes mcentenaire");
            } else if (age >= 18) {
                System.out.println("Vous êtes majeur");
            } else if (age < 0) {
                System.out.println("Age non valide");
            } else {
                System.out.println("Vous êtes mineur");
            }
    }
}