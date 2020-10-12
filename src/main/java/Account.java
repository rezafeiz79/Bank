import javax.persistence.*;

@Entity
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
    private Integer accountNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard creditCard;
    private Long balance;
    private Boolean isAvailable;
    @OneToOne(cascade = CascadeType.ALL)
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
}
