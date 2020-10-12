import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Customer extends Person {
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Account> accounts;

    public Customer(Integer id, String name, String nationalCode, String userName, String password, Set<Account> accounts) {
        super(id, name, nationalCode, userName, password);
        this.accounts = accounts;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
