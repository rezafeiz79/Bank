import javax.persistence.Entity;

@Entity
public class MainManager extends Person {
    public MainManager(Integer id, String name, String nationalCode, String userName, String password) {
        super(id, name, nationalCode, userName, password);
    }

    public MainManager() { }
}
