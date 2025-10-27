import java.util.Scanner;

public class bienvenue {
    public static void main (String[] args) {
                       //Scanner est une class fait par oracle Scanner variable = objet
/* programme 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String nom = scanner.nextLine();

        System.out.println("What is your lastname?");
        String lastname = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();
        System.out.println("your name is: " + nom + " " + lastname + " you have " + age + " yearold");

        scanner.close();
*/
/*        // rajout de condition avec if et else
        Scanner input = new Scanner(System.in);
        System.out.println("how old are you?");
        int number = input.nextInt();
        if (18 > number) {
            System.out.println("Try again");
        }
        else {
            System.out.println("you win");
        }
        scanner.close();
*/

        // pour comparer 2 valeurs
            //  (valeur1 == valeur2) si les 2 valeurs sont egale
            // (valeur1 != valeur2) si les 2 valeurs ne sont pas egale
            // (valeur1 >= valeur2) plus grand ou egal
            // (valeur1 <= valeur2) plus petit ou egal

/*
        Scanner input = new Scanner(System.in);
        System.out.println("What is your gender?");
        String gender = input.nextLine();
        if ("male".equals(gender)) {
            System.out.println("youpi");
        }
        else {
            System.out.println("perfect");
        }
        input.close();
*/

/* exercice 1

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre pour savoir si il est pair ou impair");
        int number = input.nextInt();

        if ((number % 2) == 0) {
            System.out.println("pair");
        }
        else {
            System.out.println("impair");
            }
        input.close();
*/

        //calculatrice
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Choix du type operation 1-Addition 2-soustraction 3-multiplication 4-division");
        double number = input.nextDouble();
        if (number == 1) {
            System.out.println("operation choisi 1-Addition");

            System.out.println("entrer la premiere valeur");
            double valeur1 = input.nextDouble();

            System.out.println("entrer la deuxieme valeur");
            double valeur2 = input.nextDouble();

            System.out.println (valeur1 + valeur2) ;
        }
        else if (number == 2) {
            System.out.println("operation 2-soustraction");

            System.out.println("entrer la premiere valeur");
            double valeur1 = input.nextDouble();

            System.out.println("entrer la deuxieme valeur");
            double valeur2 = input.nextDouble();

            System.out.println (valeur1 - valeur2) ;
        }
        else if (number == 3) {
            System.out.println("operation choisi 3-multiplication");

            System.out.println("entrer la premiere valeur");
            double valeur1 = input.nextDouble();

            System.out.println("entrer la deuxieme valeur");
            double valeur2 = input.nextDouble();

            System.out.println (valeur1 * valeur2) ;
        }
        else if (number == 4) {
            System.out.println("operation choisi 4-division");

            System.out.println("entrer la premiere valeur");
            double valeur1 = input.nextDouble();

            System.out.println("entrer la deuxieme valeur");
            double valeur2 = input.nextDouble();

            System.out.println (valeur1 / valeur2) ;
            }
            else {
            System.out.println("entrer une valeur valide 1,2,3,4" );
            }
*/
// exercice 1.1
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer une valeur pour savoir si elle est positive, negative ou nulle");
        double number = input.nextDouble();

        if (number < 0) {
            System.out.println("valeur negative");
        } else if (number == 0) {
            System.out.println("valeur nulle");
        }
        else {
            System.out.println("valeur povitif");
        }
*/
// exercice 1.3
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer une note entre 0 et 20");
        double number = input.nextDouble();

        if (number >= 16 ) {
            System.out.println("Très bien");
        }
        else if (number >= 12 ) {
            System.out.println("Bien");
        }
        else if (number >= 10 ) {
            System.out.println("Assez bien");
        }
        else {
            System.out.println("Insuffisant");
        }
*/

        // exercice 1.4
/*
        Scanner input = new Scanner(System.in);

        System.out.println("entrer la premiere valeur");
        double valeur1 = input.nextDouble();

        System.out.println("entrer la deuxieme valeur");
        double valeur2 = input.nextDouble();

        if (valeur1 == valeur2) {
            System.out.println(valeur1 + " Les valeurs sont égale " + valeur2);
        }
        else if (valeur1 < valeur2) {
            System.out.println(valeur1 + " est plus petite que " + valeur2);
        }
        else {
            System.out.println(valeur1 + " est plus grande que " + valeur2);
        }
 */
        // Boucle For table multiplication
/*
        Scanner input = new Scanner(System.in);

        System.out.println("choisir la table de multiplication");
        int valeur1 = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i * valeur1);
        }
*/
/*
        // exercice 2.1 2.2 2.3

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        for (int l = 0; l < 20; l++) {
            if ((l % 2) == 0) {
                System.out.println(l);
            }
        }
*/
    // exercice 2.4 pas reussi seul
/*
        int somme = 0;
        for (int i = 1; i <= 100; i++ ) {
            somme += i;
            System.out.println(somme);
        }
        System.out.println(somme);
*/
























    }
}
//ctrl-clic gauche pour voir toute fonction de scanner
//type primitif tjrs en minuscule
//classe tjrs en majuscule
//variable tjrs le premier mot en minuscule
//int plus leger pour la memoire qu un String