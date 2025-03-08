import java.util.Scanner;

public class Coeficient {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // solicitam user-ului sa introduca 2 integer
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " este " + (number1 + number2));

    }
}
