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

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv2(Integer cvv2) {
        this.cvv2 = cvv2;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setFirstPassword(Integer firstPassword) {
        this.firstPassword = firstPassword;
    }

    public void setSecondPassword(Integer secondPassword) {
        this.secondPassword = secondPassword;
    }

    public String toString() {
        String result = "";
        result += "[CreditCard ID: " + this.getId() + ", ";
        result += "CreditCard Number: " + this.getCardNumber() + ", ";
        result += "CreditCard CVV2: " + this.getCvv2() + ", ";
        result += "CreditCard Expiration Date: " + this.getExpirationDate() + "]";
        return result;
    }
}
