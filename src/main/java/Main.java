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
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case EMPLOYEE_CRUD:
                                        break;
                                    case CUSTOMER_CRUD:
                                        break;
                                    case ACCOUNT_CRUD:
                                        break;
                                    case CREDIT_CARD_CRUD:
                                        break;
                                    case TRANSACTION_CRD:
                                        break;
                                    case REPORTS:
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
                    Customer customer = View.showCustomerCreationWizard();
                    session.save(customer);
                    break;
                case EXIT:
                    mainFlag = false;
            }
        }
    }
}