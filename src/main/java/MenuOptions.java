public class MenuOptions {

    public enum MainMenu {
        SIGNIN,
        SIGNUP,
        EXIT
    }

    public enum MainMangerMenu {
        BRANCH_CRUD,
        BRANCH_MANAGER_CRUD,
        EMPLOYEE_CRUD,
        TRANSACTION_CRD,
        ACCOUNT_CRUD,
        CUSTOMER_CRUD,
        CREDIT_CARD_CRUD,
        REPORTS,
        BACK
    }

    public enum EmployeeCRUDMenu {
        CREATE_EMPLOYEE,
        GET_ALL_EMPLOYEES,
        GET_EMPLOYEE,
        UPDATE_EMPLOYEE,
        DELETE_EMPLOYEE,
        BACK
    }

    public enum BranchManagerCRUDMenu {
        CREATE_BRANCH_MANAGER,
        GET_ALL_BRANCH_MANAGERS,
        GET_BRANCH_MANAGER,
        UPDATE_BRANCH_MANAGER,
        DELETE_BRANCH_MANAGER,
        BACK
    }

    public enum BranchCRUDMenu {
        CREATE_BRANCH,
        GET_ALL_BRANCHES,
        GET_BRANCH,
        UPDATE_BRANCH,
        DELETE_BRANCH,
        BACK
    }

    public enum CustomerCRUDMenu {
        CREATE_CUSTOMER,
        GET_ALL_CUSTOMERS,
        GET_CUSTOMER,
        UPDATE_CUSTOMER,
        DELETE_CUSTOMER,
        BACK
    }

    public enum AccountCRUDMenu {
        CREATE_ACCOUNT,
        GET_ALL_ACCOUNTS,
        GET_ACCOUNT,
        UPDATE_ACCOUNT,
        DELETE_ACCOUNT,
        BACK
    }

    public enum TransactionCRDMenu {
        CREATE_TRANSACTION,
        GET_ALL_TRANSACTIONS,
        GET_TRANSACTION,
        DELETE_TRANSACTION,
        BACK
    }

    public enum CreditCardCRUDMenu {
        CREATE_CREDIT_CARD,
        GET_ALL_CREDIT_CARDS,
        GET_CREDIT_CARD,
        UPDATE_CREDIT_CARD,
        DELETE_CREDIT_CARD,
        BACK
    }

    public enum ReportsMenu {
        GET_TOTAL_BALANCE,
        BACK
    }
}
