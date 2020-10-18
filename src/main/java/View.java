import org.hibernate.Session;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static MenuOptions.MainMenu showMainMenu() {
        int choice;
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up As Customer");
        System.out.println("3. Exit");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.MainMenu.SIGNIN;
            case 2:
                return MenuOptions.MainMenu.SIGNUP;
            case 3:
                return MenuOptions.MainMenu.EXIT;
        }
        return null;
    }

    public static MenuOptions.MainMangerMenu showMainManagerMenu() {
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
        switch (choice) {
            case 1:
                return MenuOptions.MainMangerMenu.BRANCH_CRUD;
            case 2:
                return MenuOptions.MainMangerMenu.BRANCH_MANAGER_CRUD;
            case 3:
                return MenuOptions.MainMangerMenu.EMPLOYEE_CRUD;
            case 4:
                return MenuOptions.MainMangerMenu.TRANSACTION_CRD;
            case 5:
                return MenuOptions.MainMangerMenu.ACCOUNT_CRUD;
            case 6:
                return MenuOptions.MainMangerMenu.CUSTOMER_CRUD;
            case 7:
                return MenuOptions.MainMangerMenu.CREDIT_CARD_CRUD;
            case 8:
                return MenuOptions.MainMangerMenu.REPORTS;
            case 9:
                return MenuOptions.MainMangerMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.BranchCRUDMenu showBranchCRUDMenu() {
        int choice;
        System.out.println("1. Create Branch");
        System.out.println("2. Get List Of Branches");
        System.out.println("3. Get Branch By ID");
        System.out.println("4. Update Branch");
        System.out.println("5. Delete Branch");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.BranchCRUDMenu.CREATE_BRANCH;
            case 2:
                return MenuOptions.BranchCRUDMenu.GET_ALL_BRANCHES;
            case 3:
                return MenuOptions.BranchCRUDMenu.GET_BRANCH;
            case 4:
                return MenuOptions.BranchCRUDMenu.UPDATE_BRANCH;
            case 5:
                return MenuOptions.BranchCRUDMenu.DELETE_BRANCH;
            case 6:
                return MenuOptions.BranchCRUDMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.BranchManagerCRUDMenu showBranchManagerCRUDMenu() {
        int choice;
        System.out.println("1. Create BranchManager");
        System.out.println("2. Get List Of BranchManagers");
        System.out.println("3. Get BranchManager By ID");
        System.out.println("4. Update BranchManager");
        System.out.println("5. Delete BranchManager");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.BranchManagerCRUDMenu.CREATE_BRANCH_MANAGER;
            case 2:
                return MenuOptions.BranchManagerCRUDMenu.GET_ALL_BRANCH_MANAGERS;
            case 3:
                return MenuOptions.BranchManagerCRUDMenu.GET_BRANCH_MANAGER;
            case 4:
                return MenuOptions.BranchManagerCRUDMenu.UPDATE_BRANCH_MANAGER;
            case 5:
                return MenuOptions.BranchManagerCRUDMenu.DELETE_BRANCH_MANAGER;
            case 6:
                return MenuOptions.BranchManagerCRUDMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.EmployeeCRUDMenu showEmployeeCRUDMenu() {
        int choice;
        System.out.println("1. Create Employee");
        System.out.println("2. Get List Of Employees");
        System.out.println("3. Get Employee By ID");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.EmployeeCRUDMenu.CREATE_EMPLOYEE;
            case 2:
                return MenuOptions.EmployeeCRUDMenu.GET_ALL_EMPLOYEES;
            case 3:
                return MenuOptions.EmployeeCRUDMenu.GET_EMPLOYEE;
            case 4:
                return MenuOptions.EmployeeCRUDMenu.UPDATE_EMPLOYEE;
            case 5:
                return MenuOptions.EmployeeCRUDMenu.DELETE_EMPLOYEE;
            case 6:
                return MenuOptions.EmployeeCRUDMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.TransactionCRDMenu showTransactionCRDMenu() {
        int choice;
        System.out.println("1. Create Transaction");
        System.out.println("2. Get List Of Transactions");
        System.out.println("3. Get Transaction By ID");
        System.out.println("4. Delete Employee");
        System.out.println("5. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.TransactionCRDMenu.CREATE_TRANSACTION;
            case 2:
                return MenuOptions.TransactionCRDMenu.GET_ALL_TRANSACTIONS;
            case 3:
                return MenuOptions.TransactionCRDMenu.GET_TRANSACTION;
            case 4:
                return MenuOptions.TransactionCRDMenu.DELETE_TRANSACTION;
            case 5:
                return MenuOptions.TransactionCRDMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.AccountCRUDMenu showAccountCRUDMenu() {
        int choice;
        System.out.println("1. Create Account");
        System.out.println("2. Get List Of Accounts");
        System.out.println("3. Get Account By ID");
        System.out.println("4. Update Account");
        System.out.println("5. Delete Account");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.AccountCRUDMenu.CREATE_ACCOUNT;
            case 2:
                return MenuOptions.AccountCRUDMenu.GET_ALL_ACCOUNTS;
            case 3:
                return MenuOptions.AccountCRUDMenu.GET_ACCOUNT;
            case 4:
                return MenuOptions.AccountCRUDMenu.UPDATE_ACCOUNT;
            case 5:
                return MenuOptions.AccountCRUDMenu.DELETE_ACCOUNT;
            case 6:
                return MenuOptions.AccountCRUDMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.CustomerCRUDMenu showCustomerCRUDMenu() {
        int choice;
        System.out.println("1. Create Customer");
        System.out.println("2. Get List Of Customers");
        System.out.println("3. Get Customer By ID");
        System.out.println("4. Update Customer");
        System.out.println("5. Delete Customer");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.CustomerCRUDMenu.CREATE_CUSTOMER;
            case 2:
                return MenuOptions.CustomerCRUDMenu.GET_ALL_CUSTOMERS;
            case 3:
                return MenuOptions.CustomerCRUDMenu.GET_CUSTOMER;
            case 4:
                return MenuOptions.CustomerCRUDMenu.UPDATE_CUSTOMER;
            case 5:
                return MenuOptions.CustomerCRUDMenu.DELETE_CUSTOMER;
            case 6:
                return MenuOptions.CustomerCRUDMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.CreditCardCRUDMenu showCreditCardCRUDMenu() {
        int choice;
        System.out.println("1. Create CreditCard");
        System.out.println("2. Get List Of CreditCards");
        System.out.println("3. Get CreditCard By ID");
        System.out.println("4. Update CreditCard");
        System.out.println("5. Delete CreditCard");
        System.out.println("6. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.CreditCardCRUDMenu.CREATE_CREDIT_CARD;
            case 2:
                return MenuOptions.CreditCardCRUDMenu.GET_ALL_CREDIT_CARDS;
            case 3:
                return MenuOptions.CreditCardCRUDMenu.GET_CREDIT_CARD;
            case 4:
                return MenuOptions.CreditCardCRUDMenu.UPDATE_CREDIT_CARD;
            case 5:
                return MenuOptions.CreditCardCRUDMenu.DELETE_CREDIT_CARD;
            case 6:
                return MenuOptions.CreditCardCRUDMenu.BACK;
        }
        return null;
    }

    public static MenuOptions.ReportsMenu showReportsMenu() {
        int choice;
        System.out.println("1. Get Total Balance Of Bank");
        System.out.println("2. Back To Previous Menu");
        System.out.print("Enter The Number Of Your Choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return MenuOptions.ReportsMenu.GET_TOTAL_BALANCE;
            case 2:
                return MenuOptions.ReportsMenu.BACK;
        }
        return null;
    }

    public static Branch showBranchCreationWizard() {
        String name;
        System.out.print("Enter Branch Name: ");
        name = scanner.nextLine();
        return new Branch(null, name, null, null);
    }

    public static Branch showBranchUpdateWizard(Branch branch) {
        String name;
        System.out.print("Enter Branch Name: ");
        name = scanner.nextLine();
        branch.setName(name);
        return branch;
    }

    public static BranchManager showBranchManagerCreationWizard(Branch branch) {
        String name;
        String nationalCode;
        String userName;
        String password;
        System.out.print("Enter BranchManager Name: ");
        name = scanner.nextLine();
        System.out.print("Enter BranchManager NationalCode: ");
        nationalCode = scanner.nextLine();
        System.out.print("Enter BranchManager UserName: ");
        userName = scanner.nextLine();
        System.out.print("Enter BranchManager Password: ");
        password = scanner.nextLine();
        BranchManager branchManager = new BranchManager(null, name, nationalCode, userName, password, null, branch);
        branch.setBranchManager(branchManager);
        return branchManager;
    }

    public static Customer showCustomerCreationWizard() {
        String name;
        String nationalCode;
        String userName;
        String password;
        System.out.print("Enter Customer Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Customer NationalCode: ");
        nationalCode = scanner.nextLine();
        System.out.print("Enter Customer UserName: ");
        userName = scanner.nextLine();
        System.out.print("Enter Customer Password: ");
        password = scanner.nextLine();
        return new Customer(null, name, nationalCode, userName, password, null);
    }

    public static Employee showEmployeeCreationWizard(BranchManager branchManager, Branch branch) {
        String name;
        String nationalCode;
        String userName;
        String password;
        System.out.print("Enter Employee Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Employee NationalCode: ");
        nationalCode = scanner.nextLine();
        System.out.print("Enter Employee UserName: ");
        userName = scanner.nextLine();
        System.out.print("Enter Employee Password: ");
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
            Account account = new Account(null, customer, accountNumber, null, 0l, true, branch);
            if (customer.getAccounts() != null) {
                customer.getAccounts().add(account);
            } else {
                Set<Account> madeAccounts = new HashSet<>();
                madeAccounts.add(account);
                customer.setAccounts(madeAccounts);
            }
            return account;
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

    public static Person showSignInWizard(Set<Person> persons) {
        String userName;
        String password;
        System.out.print("Enter UserName: ");
        userName = scanner.nextLine();
        System.out.print("Enter Password: ");
        password = scanner.nextLine();
        for (Person person : persons) {
            if (person.getUserName().equals(userName) && person.getPassword().equals(password)) {
                return person;
            }
        }
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