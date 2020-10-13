import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Employee extends Person {
    @OneToOne
    private BranchManager branchManager;
    @OneToOne
    private Branch branch;

    public Employee(Integer id, String name, String nationalCode, String userName, String password, BranchManager branchManager, Branch branch) {
        super(id, name, nationalCode, userName, password);
        this.branchManager = branchManager;
        this.branch = branch;
    }

    public BranchManager getBranchManager() {
        return branchManager;
    }

    public Branch getBranch() {
        return branch;
    }
}
