import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Session session = DatabaseUtil.getSessionFactory().openSession();
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
                            mainMangerMenuOption = View.showMainManagerMenu();
                            boolean mainManagerMenuFlag = true;
                            while (mainManagerMenuFlag) {
                                switch (mainMangerMenuOption) {
                                    case BRANCH_CRUD:
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