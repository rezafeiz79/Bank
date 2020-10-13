import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);

    public static int showMainMenu() {
        int choice;
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up As Customer");
        System.out.println("3. Exit");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
