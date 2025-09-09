import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1. Assignment A");
            System.out.println("2. Assignment B");
            System.out.println("3. Assignment C");
            System.out.print("Choose assignment A, B, C (e = exit): ");
            char chosenAssignment = scanner.next().charAt(0);

            switch (chosenAssignment) {
                case 'e':
                case 'E':
                    flag = false;
                    break;
                case 'a':
                case 'A':
                    System.out.println("- Assignment A -");
                    UppgiftA.main(args);
                    break;
                case 'b':
                case 'B':
                    System.out.println("- Assignment B -");
                    UppgiftB.main(args);
                    break;
                case 'c':
                case 'C':
                    System.out.println("- Assignment C -");
                    UppgiftC.main(args);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Bye bye!");
    }
}
