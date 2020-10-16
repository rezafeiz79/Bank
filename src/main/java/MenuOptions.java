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
}
