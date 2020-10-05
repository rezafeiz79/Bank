import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nationalCode;
    private String userName;
    private String password;

    public Person(Integer id, String name, String nationalCode, String userName, String password) {
        this.id = id;
        this.name = name;
        this.nationalCode = nationalCode;
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
