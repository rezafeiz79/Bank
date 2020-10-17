import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = DatabaseUtil.getSessionFactory().openSession();
        MenuOptions.MainMenu mainMenuOption;
        boolean mainFlag = true;
        while(mainFlag) {
            mainMenuOption = View.showMainMenu();
            switch (mainMenuOption) {
                case SIGNIN:
                    break;
                case SIGNUP:
                    break;
                case EXIT:
                    mainFlag = false;
            }
        }
    }
}
