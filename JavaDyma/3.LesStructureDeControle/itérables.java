import java.util.ArrayList;

public class itérables {
    public static void main(String[] args) {

        var entier = 2;

        //Tableaux
        int[] entiers = {1, 2, 8};
        int [] entier2 = new int[10];
        entier2[0] =2;

        //Listes
        ArrayList<String> entiersList = new ArrayList<>();
        entiersList.add("Fraises");
        entiersList.add("Pommes");
        entiersList.add("Poires");
        entiersList.add("Bannane");

        System.out.println(entiersList.get(1));
        System.out.println(entiersList.get(3));
        
        

    }
}
