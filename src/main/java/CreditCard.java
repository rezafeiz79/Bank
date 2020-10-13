import javax.persistence.*;

@Entity
public class CreditCard {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cardNumber;
    private Integer cvv2;
    private String expirationDate;
    private Integer firstPassword;
    private Integer secondPassword;
    @OneToOne
    private Account account;

    public CreditCard(Integer id, Integer cardNumber, Integer cvv2, String expirationDate, Integer firstPassword, Integer secondPassword, Account account) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cvv2 = cvv2;
        this.expirationDate = expirationDate;
        this.firstPassword = firstPassword;
        this.secondPassword = secondPassword;
        this.account = account;
    }

    public CreditCard() { }

    public Integer getId() {
        return id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public Integer getCvv2() {
        return cvv2;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public Integer getFirstPassword() {
        return firstPassword;
    }

    public Integer getSecondPassword() {
        return secondPassword;
    }

    public Account getAccount() {
        return account;
    }
}
