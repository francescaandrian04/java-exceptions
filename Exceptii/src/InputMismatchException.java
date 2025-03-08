import java.util.*;

public class InputMismatchException {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Introduceti un numar intreg:");
                int number = input.nextInt();

                System.out.println("Numarul introdus este " + number);
                continueInput = false;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Incercati din nou. (" + "Introducere incorecta: este necesar un numar intreg)" );
                input.nextLine();
            }
        } while (continueInput);

        System.out.println("Executia continuă ...");
    }

}
