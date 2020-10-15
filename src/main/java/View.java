import org.hibernate.Session;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

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

    public static Branch showBranchCreationWizard(BranchManager branchManager, Set<Account> accounts) {
        String name;
        System.out.print("Enter Branch Name: ");
        name = scanner.nextLine();
        return new Branch(null, name, branchManager, accounts);
    }

    public static BranchManager showBranchManagerCreationWizard(Branch branch, Set<Employee> employees) {
        String name;
        String nationalCode;
        String userName;
        String password;
        System.out.print("Enter Branch Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Branch NationalCode: ");
        nationalCode = scanner.nextLine();
        System.out.print("Enter Branch UserName: ");
        userName = scanner.nextLine();
        System.out.print("Enter Branch Password: ");
        password = scanner.nextLine();
        return new BranchManager(null, name, nationalCode, userName, password, employees, branch);
    }

    public static Customer showCustomerCreationWizard(Set<Account> accounts) {
        String name;
        String nationalCode;
        String userName;
        String password;
        System.out.print("Enter Branch Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Branch NationalCode: ");
        nationalCode = scanner.nextLine();
        System.out.print("Enter Branch UserName: ");
        userName = scanner.nextLine();
        System.out.print("Enter Branch Password: ");
        password = scanner.nextLine();
        return new Customer(null, name, nationalCode, userName, password, accounts);
    }

    public static Employee showEmployeeCreationWizard(BranchManager branchManager, Branch branch) {
        String name;
        String nationalCode;
        String userName;
        String password;
        System.out.print("Enter Branch Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Branch NationalCode: ");
        nationalCode = scanner.nextLine();
        System.out.print("Enter Branch UserName: ");
        userName = scanner.nextLine();
        System.out.print("Enter Branch Password: ");
        password = scanner.nextLine();
        return new Employee(null, name, nationalCode, userName, password, branchManager, branch);
    }

    public static Account callAccountCreationWizard(Customer customer, Branch branch, Set<Account> accounts) {
        int accountNumber = random.nextInt(100000) + 100000;
        boolean isUnique = true;
        for (Account account : accounts) {
            if (accountNumber == account.getAccountNumber()) {
                isUnique = false;
            }
        }
        if (isUnique) {
            return new Account(null, customer, accountNumber, null, 0l, true, branch);
        } else {
            callAccountCreationWizard(customer, branch, accounts);
        }
        return null;
    }

    public static CreditCard showCreditCardCreationWizard(Account account, Set<CreditCard> creditCards) {
        int firstPassword;
        int secondPassword;
        String expirationDate = null;
        int cvv2 = random.nextInt(1000) + 1000;
        int cardNumber = random.nextInt(100000) + 100000;
        boolean isUnique = true;
        for (CreditCard creditCard : creditCards) {
            if (cvv2 == creditCard.getCvv2() || cardNumber == creditCard.getCardNumber()) {
                isUnique = false;
            }
        }
        if (isUnique) {
            System.out.print("Enter First Password: ");
            firstPassword = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Second Password: ");
            secondPassword = Integer.parseInt(scanner.nextLine());
            CreditCard creditCard = new CreditCard(null, cardNumber, cvv2, expirationDate, firstPassword, secondPassword, account);
            account.setCreditCard(creditCard);
            return creditCard;
        } else {
            System.out.println("Please Enter Info Again!");
            showCreditCardCreationWizard(account, creditCards);
        }
        return null;
    }

    public static Branch showBranchSelectionMenu(Session session) {
        int id;
        System.out.print("Enter Branch ID: ");
        id = Integer.parseInt(scanner.nextLine());
        return DatabaseUtil.getEntityById(session, Branch.class, id);
    }

    public static BranchManager showBranchManagerSelectionMenu(Session session) {
        int id;
        System.out.print("Enter BranchManager ID: ");
        id = Integer.parseInt(scanner.nextLine());
        return DatabaseUtil.getEntityById(session, BranchManager.class, id);
    }

    public static Account showAccountSelectionMenu(Session session) {
        int id;
        System.out.print("Enter Account ID: ");
        id = Integer.parseInt(scanner.nextLine());
        return DatabaseUtil.getEntityById(session, Account.class, id);
    }

    public static CreditCard showCreditCardSelectionMenu(Session session) {
        int id;
        System.out.print("Enter CreditCard ID: ");
        id = Integer.parseInt(scanner.nextLine());
        return DatabaseUtil.getEntityById(session, CreditCard.class, id);
    }

    public static Customer showCustomerSelectionMenu(Session session) {
        int id;
        System.out.print("Enter Customer ID: ");
        id = Integer.parseInt(scanner.nextLine());
        return DatabaseUtil.getEntityById(session, Customer.class, id);
    }

    public static Employee showEmployeeSelectionMenu(Session session) {
        int id;
        System.out.print("Enter Employee ID: ");
        id = Integer.parseInt(scanner.nextLine());
        return DatabaseUtil.getEntityById(session, Employee.class, id);
    }

    public static Transaction showTransactionSelectionMenu(Session session) {
        int id;
        System.out.print("Enter Transaction ID: ");
        id = Integer.parseInt(scanner.nextLine());
        return DatabaseUtil.getEntityById(session, Transaction.class, id);
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