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

    public static int showMainManagerMenu() {
        int choice;
        System.out.println("1. Branch CRUD");
        System.out.println("2. BranchManager CRUD");
        System.out.println("3. Employee CRUD");
        System.out.println("4. Transaction CRUD");
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
}