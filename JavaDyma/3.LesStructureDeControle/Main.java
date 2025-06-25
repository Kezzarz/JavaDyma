import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //While
        var compteur = 0;
        while (compteur < 10) {
            System.out.println(compteur);
            compteur++;
        }

        //do while
        compteur =0;
        do {
            System.out.println(compteur);
            compteur++;
        } while (compteur < 0);
    }
}