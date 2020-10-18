import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Session session = DatabaseUtil.getSessionFactory().openSession();
        MainManager mainManager = new MainManager(null, null, null, "admin", "admin");
        session.save(mainManager);
        MenuOptions.MainMenu mainMenuOption;
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
                                                Branch branch = View.showBranchCreationWizard();
                                                session.save(branch);
                                                break;
                                            case GET_BRANCH:
                                                break;
                                            case GET_ALL_BRANCHES:
                                                break;
                                            case UPDATE_BRANCH:
                                                break;
                                            case DELETE_BRANCH:
                                                break;
                                            case BACK:
                                                break;
                                        }
                                        break;
                                    case BRANCH_MANAGER_CRUD:
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
                    DatabaseUtil.saveEntity(session, customer);
                    break;
                case EXIT:
                    mainFlag = false;
            }
        }
    }
}