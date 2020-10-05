public abstract class Person {
    private String name;
    private String nationalCode;
    private String userName;
    private String password;

    public Person(String name, String nationalCode, String userName, String password) {
        this.name = name;
        this.nationalCode = nationalCode;
        this.userName = userName;
        this.password = password;
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
