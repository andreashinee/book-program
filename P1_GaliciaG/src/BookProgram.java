import java.util.Scanner;

public class BookProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creem una variable booleana per detectar l'error, l'anomenarem es_error
        boolean es_error = false;
        //creem variables tipus string amb les opcions possibles per categoria i subcategoria. bàsicament perque al resultat no ens retorni el codi sinó l'string, és a dir el text.
        String[] CATEGORIES = {"Educació i formació", "Oci i temps lliure", "Novel·la", "Salut i benestar"};
        String[][] SUBCATEGORIES= {
                {"Ciència i enginyeria", "Biografies i memòries", "Finances"},
                {"Guies de viatge", "Cuina", "Esports"},
                {"Adolescents", "Ciència ficció i fantasia", "Comèdia i humor"},
                {"Nutrició", "Medicina General", "Fisioteràpia"}
        };
        //Variables per als límits i màxims de cada secció
        int MIN_CODI = 100;
        int MAX_CODI = 999;
        int MIN_PREU = 0;
        int MAX_PREU = 99;
        int MIN_UNITATS = 0;
        int MAX_UNITATS = 999999;


        // Codi del llibre
        System.out.print("Codi del llibre (entre 100 i 999): ");
        int codi = input.nextInt();
        if (codi < MIN_CODI || codi > MAX_CODI) {
            System.out.println("Error: Codi del llibre fora de l'interval vàlid.");
            es_error = true;
        }
        if (es_error) {
            System.out.println("S'han produït errors en l'entrada de dades. El programa finalitza.");
            return; // Finalitza el programa en cas d'error.
        }
        // Categoria del llibre
        System.out.println("Categoria del llibre?");
        System.out.println("0 - Educació i formació");
        System.out.println("1 - Oci i temps lliure");
        System.out.println("2 - Novel·la");
        System.out.println("3 - Salut i benestar");
        int categoria = input.nextInt();
        if (categoria < 0 || categoria > 3) {
            System.out.println("Error: Categoria no vàlida.");
            es_error = true;
        }

        if (es_error) {
            System.out.println("S'han produït errors en l'entrada de dades. El programa finalitza.");
            return; // Finalitza el programa en cas d'error.
        }

        // Subcategoria, depenent de l'opció escollida sempre que hagi estat 0-3. Tindrem diferents opcions per a cada cas.
        int subcategoria = -1;
        if (!es_error) {
            switch (categoria) {
                case 0: // Educació i formació
                    System.out.println("Subcategoria de formació?");
                    System.out.println("0 - Ciència i enginyeria");
                    System.out.println("1 - Biografies i memòries");
                    System.out.println("2 - Finances");
                    subcategoria = input.nextInt();
                    if (subcategoria < 0 || subcategoria > 2) {
                        System.out.println("Error: Subcategoria de formació no vàlida.");
                        es_error = true;
                    }
                    break;
                case 1: // Oci i temps lliure
                    System.out.println("Subcategoria de Oci i temps lliure?");
                    System.out.println("0 - Guies de viatge");
                    System.out.println("1 - Cuina");
                    System.out.println("2 - Esports");
                    subcategoria = input.nextInt();
                    if (subcategoria < 0 || subcategoria > 2) {
                        System.out.println("Error: Subcategoria d'Oci i temps lliure no vàlida.");
                        es_error = true;
                    }
                    break;
                case 2: // Novel·la
                    System.out.println("Subcategoria de novel·la?");
                    System.out.println("0 - Adolescents");
                    System.out.println("1 - Ciència ficció i fantasia");
                    System.out.println("2 - Comèdia i humor");
                    subcategoria = input.nextInt();
                    if (subcategoria < 0 || subcategoria > 2) {
                        System.out.println("Error: Subcategoria de novel·la no vàlida.");
                        es_error = true;
                    }
                    break;
                case 3: // Salut i benestar
                    System.out.println("Subcategoria?");
                    System.out.println("0 - Nutrició");
                    System.out.println("1 - Medicina General");
                    System.out.println("2 - Fisioteràpia");
                    subcategoria = input.nextInt();
                    if (subcategoria < 0 || subcategoria > 2) {
                        System.out.println("Error: Subcategoria de Salut i benestar no vàlida.");
                        es_error = true;
                    }
                    break;
            }
        }
        if (es_error) {
            System.out.println("S'han produït errors en l'entrada de dades. El programa finalitza.");
            return; // Finalitza el programa en cas d'error.
        }

        //Preu llibre
        System.out.print("Preu del llibre (entre 0 i 99): ");
        int preu = input.nextInt();
        if (preu < MIN_PREU || preu > MAX_PREU) {
            System.out.println("Error: Preu del llibre fora de l'interval vàlid.");
            es_error = true;
        }
        if (es_error) {
            System.out.println("S'han produït errors en l'entrada de dades. El programa finalitza.");
            return; // Finalitza el programa en cas d'error.
        }

        //Unitats de llibres venudes
        System.out.print("Unitats venudes del llibre (entre 0 i 999999): ");
        int unitats = input.nextInt();
        if (unitats < MIN_UNITATS || unitats > MAX_UNITATS) {
            System.out.println("Error: Unitats venudes fora de l'interval vàlid.");
            es_error = true;
        }
        if (es_error) {
            System.out.println("S'han produït errors en l'entrada de dades. El programa finalitza.");
            return; // Finalitza el programa en cas d'error.
        }

        // Si totes les dades són correctes, obtindrem la taula amb els resultats

        //per la taula he utilitzat chatgpt perque no tenia ni idea de fer-la. L'he adaptat lo millor possible per a que no quedi desquadrada.
        if (!es_error) {
            System.out.println("Resum de les dades introduïdes:");
            System.out.println("+----------------+----------------------+-----------------------+-----------+------------+");
            System.out.println("|     Codi       |   Categoria          |   Subcategoria        |   Preu    |   Unitats  |");
            System.out.println("+----------------+----------------------+-----------------------+-----------+------------+");
            System.out.printf("|     %-10d |   %-14s |   %-19s |   %-4d €  |   %-7d  |\n", codi, CATEGORIES[categoria], SUBCATEGORIES[categoria][subcategoria], preu, unitats);
            System.out.println("+----------------+----------------------+-----------------------+-----------+------------+");
        }


    }
}
