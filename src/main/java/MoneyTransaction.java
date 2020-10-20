import javax.persistence.*;

@Entity
public class MoneyTransaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private CreditCard senderCard;
    @ManyToOne
    private CreditCard receiverCard;
    private Long amount;
    private String date;

    public MoneyTransaction(Integer id, CreditCard senderCard, CreditCard receiverCard, Long amount, String date) {
        this.id = id;
        this.senderCard = senderCard;
        this.receiverCard = receiverCard;
        this.amount = amount;
        this.date = date;
        doTransaction();
    }

    public MoneyTransaction() { }

    public Integer getId() {
        return id;
    }

    public CreditCard getSenderCard() {
        return senderCard;
    }

    public CreditCard getReceiverCard() {
        return receiverCard;
    }

    public Long getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    private void doTransaction() {
        this.senderCard.getAccount().decreaseBalance(this.amount);
        this.receiverCard.getAccount().increaseBalance(this.amount);
    }

    public String toString() {
        String result = "";
        result += "[Transaction ID: " + this.getId() + ", ";
        result += "Transaction Sender Card Number: " + this.getSenderCard().getCardNumber() + ", ";
        result += "Transaction Receiver Card Number: " + this.getReceiverCard().getCardNumber() + ", ";
        result += "Transaction Amount: " + this.getAmount() + ", ";
        result += "Transaction Date: " + this.getDate() + ", ";
        return result;
    }
}