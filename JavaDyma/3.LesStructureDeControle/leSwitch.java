import java.util.Scanner;

public class leSwitch {
    public static void main(String[] args) {

        var saisieUtilisateur = new Scanner(System.in);

        System.out.println("Saisissez un chiffre :");
        var chiffre = saisieUtilisateur.nextInt();

        switch (chiffre){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            default:
                System.out.println("Invalide");

        }
    }
}