import java.util.ArrayList;

public class Employee extends User{
    private int ptoDays;
    private String userName;
    private String password;

    public Employee(String firstName, String lastName, String email, int userId, ArrayList<String> checkedOutBooks, double balanceUnpaid, int ptoDays, String userName, String password) {
        super(firstName, lastName, email, userId, checkedOutBooks, balanceUnpaid);
        this.ptoDays = ptoDays;
        this.userName = userName;
        this.password = password;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void overduePayments(int daysOverdue) {
        balanceUnpaid += 0.10;

    }


}
