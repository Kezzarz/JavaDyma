import java.util.ArrayList;
import java.util.List;

public class laBoucleFor {
    public static void main(String[] args) {
           
        //Classique
           for (int compteur = 0; compteur < 10; compteur++) {
               System.out.println("Compteur : " + compteur);
           }
        //Parcours de collections
        var fruits = new ArrayList<String>();
        fruits.add("Pommes");
        fruits.add("Poires");
        fruits.add("Fraises");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }