import java.util.Scanner;
import java.util.Set;

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

    public static int showMainManagerMenu() {
        int choice;
        System.out.println("1. Branch CRUD");
        System.out.println("2. BranchManager CRUD");
        System.out.println("3. Employee CRUD");
        System.out.println("4. Transaction CRD");
        System.out.println("5. Account CRUD");
        System.out.println("6. Customer CRUD");
        System.out.println("7. CreditCards CRUD");
        System.out.println("8. Reports");
        System.out.println("9. Back To Main Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showBranchCRUDMenu() {
        int choice;
        System.out.println("1. Create Branch");
        System.out.println("2. Get List Of Branches");
        System.out.println("3. Get Branch By ID");
        System.out.println("4. Update Branch");
        System.out.println("5. Delete Branch");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showBranchManagerCRUDMenu() {
        int choice;
        System.out.println("1. Create BranchManager");
        System.out.println("2. Get List Of BranchManagers");
        System.out.println("3. Get BranchManager By ID");
        System.out.println("4. Update BranchManager");
        System.out.println("5. Delete BranchManager");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showEmployeeCRUDMenu() {
        int choice;
        System.out.println("1. Create Employee");
        System.out.println("2. Get List Of Employees");
        System.out.println("3. Get Employee By ID");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showTransactionCRDMenu() {
        int choice;
        System.out.println("1. Create Transaction");
        System.out.println("2. Get List Of Transactions");
        System.out.println("3. Get Transaction By ID");
        System.out.println("4. Delete Employee");
        System.out.println("5. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showAccountCRUDMenu() {
        int choice;
        System.out.println("1. Create Account");
        System.out.println("2. Get List Of Accounts");
        System.out.println("3. Get Account By ID");
        System.out.println("4. Update Account");
        System.out.println("5. Delete Account");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showCustomerCRUDMenu() {
        int choice;
        System.out.println("1. Create Customer");
        System.out.println("2. Get List Of Customers");
        System.out.println("3. Get Customer By ID");
        System.out.println("4. Update Customer");
        System.out.println("5. Delete Customer");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showCreditCardCRUDMenu() {
        int choice;
        System.out.println("1. Create CreditCard");
        System.out.println("2. Get List Of CreditCards");
        System.out.println("3. Get CreditCard By ID");
        System.out.println("4. Update CreditCard");
        System.out.println("5. Delete CreditCard");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int showReportsMenu() {
        int choice;
        System.out.println("1. Get Total Balance Of Bank");
        System.out.println("2. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static Branch showBranchCreationWizard() {
        return null;
    }

    public static <T> void showListOfEntities(Set<T> set) {
        for (T element : set) {
            System.out.println(element.toString());
        }
    }

    public static <T> void showEntity(T element) {
        System.out.println(element.toString());
    }
}