package guru.springframework.examplebeans;

public class FakeDataSource {

    private String username;
    private String password;
    private String dbUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDburl() {
        return dbUrl;
    }

    public void setDburl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
