import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class BranchManager extends Person {
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Employee> employees;
    @OneToOne
    private Branch branch;

    public BranchManager(Integer id, String name, String nationalCode, String userName, String password, Set<Employee> employees, Branch branch) {
        super(id, name, nationalCode, userName, password);
        this.employees = employees;
        this.branch = branch;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public Branch getBranch() {
        return branch;
    }
}
