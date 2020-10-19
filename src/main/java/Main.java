import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Session session = DatabaseUtil.getSessionFactory().openSession();
        Transaction transaction;
        //MainManager mainManager = new MainManager(null, null, null, "admin", "admin");
        //session.save(mainManager);
        MenuOptions.MainMenu mainMenuOption;
        Branch branch;
        BranchManager branchManager;
        Employee employee;
        Customer customer;
        boolean mainFlag = true;
        while(mainFlag) {
            mainMenuOption = View.showMainMenu();
            switch (mainMenuOption) {
                case SIGNIN:
                    Set<Person> persons = new HashSet<>();
                    persons.addAll(DatabaseUtil.getAllEntities(session, MainManager.class));
                    persons.addAll(DatabaseUtil.getAllEntities(session, BranchManager.class));
                    persons.addAll(DatabaseUtil.getAllEntities(session, Employee.class));
                    persons.addAll(DatabaseUtil.getAllEntities(session, Customer.class));
                    Person person = View.showSignInWizard(persons);
                    if (person != null) {
                        if (person instanceof MainManager) {
                            MenuOptions.MainMangerMenu mainMangerMenuOption;
                            boolean mainManagerMenuFlag = true;
                            while (mainManagerMenuFlag) {
                                mainMangerMenuOption = View.showMainManagerMenu();
                                switch (mainMangerMenuOption) {
                                    case BRANCH_CRUD:
                                        MenuOptions.BranchCRUDMenu branchCRUDMenuOption;
                                        branchCRUDMenuOption = View.showBranchCRUDMenu();
                                        switch (branchCRUDMenuOption) {
                                            case CREATE_BRANCH:
                                                transaction = session.beginTransaction();
                                                branch = View.showBranchCreationWizard();
                                                session.save(branch);
                                                transaction.commit();
                                                break;
                                            case GET_BRANCH:
                                                branch = View.showBranchSelectionMenu(session);
                                                View.showEntity(branch);
                                                break;
                                            case GET_ALL_BRANCHES:
                                                View.showListOfEntities(DatabaseUtil.getAllEntities(session, Branch.class));
                                                break;
                                            case UPDATE_BRANCH:
                                                transaction = session.beginTransaction();
                                                branch = View.showBranchSelectionMenu(session);
                                                View.showBranchUpdateWizard(branch);
                                                session.update(branch);
                                                transaction.commit();
                                                break;
                                            case DELETE_BRANCH:
                                                transaction = session.beginTransaction();
                                                branch = View.showBranchSelectionMenu(session);
                                                session.delete(branch);
                                                transaction.commit();
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case BRANCH_MANAGER_CRUD:
                                        MenuOptions.BranchManagerCRUDMenu branchManagerCRUDMenuOption;
                                        branchManagerCRUDMenuOption = View.showBranchManagerCRUDMenu();
                                        switch (branchManagerCRUDMenuOption) {
                                            case CREATE_BRANCH_MANAGER:
                                                transaction = session.beginTransaction();
                                                branch = View.showBranchSelectionMenu(session);
                                                branchManager = View.showBranchManagerCreationWizard(branch);
                                                session.save(branchManager);
                                                session.update(branch);
                                                transaction.commit();
                                                break;
                                            case GET_BRANCH_MANAGER:
                                                branchManager = View.showBranchManagerSelectionMenu(session);
                                                View.showEntity(branchManager);
                                                break;
                                            case GET_ALL_BRANCH_MANAGERS:
                                                View.showListOfEntities(DatabaseUtil.getAllEntities(session, BranchManager.class));
                                                break;
                                            case UPDATE_BRANCH_MANAGER:
                                                transaction = session.beginTransaction();
                                                branchManager = View.showBranchManagerSelectionMenu(session);
                                                View.showBranchManagerUpdateWizard(branchManager);
                                                session.update(branchManager);
                                                transaction.commit();
                                                break;
                                            case DELETE_BRANCH_MANAGER:
                                                transaction = session.beginTransaction();
                                                branchManager = View.showBranchManagerSelectionMenu(session);
                                                session.delete(branchManager);
                                                transaction.commit();
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case EMPLOYEE_CRUD:
                                        MenuOptions.EmployeeCRUDMenu employeeCRUDMenuOption;
                                        employeeCRUDMenuOption = View.showEmployeeCRUDMenu();
                                        switch (employeeCRUDMenuOption) {
                                            case CREATE_EMPLOYEE:
                                                transaction = session.beginTransaction();
                                                branch = View.showBranchSelectionMenu(session);
                                                branchManager = View.showBranchManagerSelectionMenu(session);
                                                employee = View.showEmployeeCreationWizard(branchManager, branch);
                                                session.save(employee);
                                                session.update(branch);
                                                session.update(branchManager);
                                                transaction.commit();
                                                break;
                                            case GET_EMPLOYEE:
                                                employee = View.showEmployeeSelectionMenu(session);
                                                View.showEntity(employee);
                                                break;
                                            case GET_ALL_EMPLOYEES:
                                                View.showListOfEntities(DatabaseUtil.getAllEntities(session, Employee.class));
                                                break;
                                            case UPDATE_EMPLOYEE:
                                                transaction = session.beginTransaction();
                                                employee = View.showEmployeeSelectionMenu(session);
                                                View.showEmployeeUpdateWizard(employee);
                                                session.update(employee);
                                                transaction.commit();
                                                break;
                                            case DELETE_EMPLOYEE:
                                                transaction = session.beginTransaction();
                                                employee = View.showEmployeeSelectionMenu(session);
                                                session.delete(employee);
                                                transaction.commit();
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case CUSTOMER_CRUD:
                                        MenuOptions.CustomerCRUDMenu customerCRUDMenuOption;
                                        customerCRUDMenuOption = View.showCustomerCRUDMenu();
                                        switch (customerCRUDMenuOption) {
                                            case CREATE_CUSTOMER:
                                                break;
                                            case GET_CUSTOMER:
                                                break;
                                            case GET_ALL_CUSTOMERS:
                                                break;
                                            case UPDATE_CUSTOMER:
                                                break;
                                            case DELETE_CUSTOMER:
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case ACCOUNT_CRUD:
                                        MenuOptions.AccountCRUDMenu accountCRUDMenuOption;
                                        accountCRUDMenuOption = View.showAccountCRUDMenu();
                                        switch (accountCRUDMenuOption) {
                                            case CREATE_ACCOUNT:
                                                break;
                                            case GET_ACCOUNT:
                                                break;
                                            case GET_ALL_ACCOUNTS:
                                                break;
                                            case UPDATE_ACCOUNT:
                                                break;
                                            case DELETE_ACCOUNT:
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case CREDIT_CARD_CRUD:
                                        MenuOptions.CreditCardCRUDMenu creditCardCRUDMenuOption;
                                        creditCardCRUDMenuOption = View.showCreditCardCRUDMenu();
                                        switch (creditCardCRUDMenuOption) {
                                            case CREATE_CREDIT_CARD:
                                                break;
                                            case GET_CREDIT_CARD:
                                                break;
                                            case GET_ALL_CREDIT_CARDS:
                                                break;
                                            case UPDATE_CREDIT_CARD:
                                                break;
                                            case DELETE_CREDIT_CARD:
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case TRANSACTION_CRD:
                                        MenuOptions.TransactionCRDMenu transactionCRDMenuOption;
                                        transactionCRDMenuOption = View.showTransactionCRDMenu();
                                        switch (transactionCRDMenuOption) {
                                            case CREATE_TRANSACTION:
                                                break;
                                            case GET_TRANSACTION:
                                                break;
                                            case GET_ALL_TRANSACTIONS:
                                                break;
                                            case DELETE_TRANSACTION:
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case REPORTS:
                                        MenuOptions.ReportsMenu reportsMenuOption;
                                        reportsMenuOption = View.showReportsMenu();
                                        switch (reportsMenuOption) {
                                            case GET_TOTAL_BALANCE:
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case BACK:
                                        mainManagerMenuFlag = false;
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case SIGNUP:
                    Customer signedUpCustomer = View.showCustomerCreationWizard();
                    transaction = session.beginTransaction();
                    session.save(signedUpCustomer);
                    transaction.commit();
                    break;
                case EXIT:
                    mainFlag = false;
            }
        }
    }
}