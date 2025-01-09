import java.util.Scanner;

public class operateurTernaire {
    public static void main(String[] args) {

        var saisieUtilisateur = new Scanner(System.in);

        System.out.println("Saisissez un chiffre :");
        var age = saisieUtilisateur.nextInt();

        var isMajeurString = age >= 18 ? "Majeur" : "Mineur";
        System.out.println(isMajeurString);
    }
}
