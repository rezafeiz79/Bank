import javax.persistence.*;

@Entity
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Customer customer;
    private Integer accountNumber;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private CreditCard creditCard;
    private Long balance;
    private Boolean isAvailable;
    @OneToOne
    private Branch branch;

    public Account(Integer id, Customer customer, Integer accountNumber, CreditCard creditCard, Long balance, Boolean isAvailable, Branch branch) {
        this.id = id;
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.creditCard = creditCard;
        this.balance = balance;
        this.isAvailable = isAvailable;
        this.branch = branch;
    }

    public Account(Integer id, Customer customer, Integer accountNumber, Long balance, Boolean isAvailable, Branch branch) {
        this.id = id;
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isAvailable = isAvailable;
        this.branch = branch;
    }

    public Account() { }

    public Integer getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public Long getBalance() {
        return balance;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void increaseBalance(long amount) {
        this.balance += amount;
    }

    public void decreaseBalance(long amount) {
        this.balance -= amount;
    }
}
