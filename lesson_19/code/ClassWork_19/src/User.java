/**
 * @author Andrej Reutow
 * created on 29.09.2023
 */
public class User {

    private long id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
