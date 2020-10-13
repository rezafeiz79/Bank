import javax.persistence.*;

@Entity
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private CreditCard senderCard;
    @ManyToOne
    private CreditCard receiverCard;
    private Long amount;
    private String date;

    public Transaction(Integer id, CreditCard senderCard, CreditCard receiverCard, Long amount, String date) {
        this.id = id;
        this.senderCard = senderCard;
        this.receiverCard = receiverCard;
        this.amount = amount;
        this.date = date;
    }

    public Transaction() { }

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
}
