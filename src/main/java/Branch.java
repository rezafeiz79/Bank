import javax.persistence.*;
import java.util.Set;

@Entity
public class Branch {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private BranchManager branchManager;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private Set<Account> accounts;

    public Branch(Integer id, String name, BranchManager branchManager, Set<Account> accounts) {
        this.id = id;
        this.name = name;
        this.branchManager = branchManager;
        this.accounts = accounts;
    }

    public Branch(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Branch() { }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BranchManager getBranchManager() {
        return branchManager;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setBranchManager(BranchManager branchManager) {
        this.branchManager = branchManager;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}